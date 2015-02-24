package com.numhero.server.model.dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.inject.Inject;
import com.numhero.server.model.dao.filter.IJDOFilter;
import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.Persistable;
import com.numhero.server.search.TextTokenizer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.jdo.*;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public abstract class BaseDao<T extends Persistable> {
    protected static Log log = LogFactory.getLog(BaseDao.class);

    protected Class<T> persistentClass;

    @Inject
    protected PersistenceManagerFactory pmf;

    @Inject
    protected TextTokenizer textTokenizer;

    @SuppressWarnings("unchecked")
    public BaseDao() {
        try {
            this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Exception ex) {
            log.error("constructor", ex);
        }
    }

    public T get(String id) {
        return get(persistentClass, id);
    }

    public T get(Key id) {
        return get(persistentClass, id);
    }

    public List<T> getListFromIds(String csvIds) {
        List<T> ret = new ArrayList<T>();

        if (csvIds != null && csvIds.length() > 0) {
            StringTokenizer st = new StringTokenizer(csvIds, ",");
            while (st.hasMoreTokens()) {
                String sId = st.nextToken().trim();
                T entity = get(sId);
                if (entity != null) {
                    ret.add(entity);
                }
            }
        }

        return ret;
    }

    public boolean save(T pojo) {
        PersistenceManager pm = pmf.getPersistenceManagerProxy();
        Transaction tx = pm.currentTransaction();
        try {
            tx.begin();
            pm.makePersistent(pojo);
            tx.commit();
        } catch (Throwable th) {
            log.error("save", th);
            return false;
        } finally {
            if (tx.isActive()) {
                tx.rollback();
                return false;
            }
        }
        return true;
    }

    public boolean delete(T pojo) {
        PersistenceManager pm = pmf.getPersistenceManagerProxy();
        Transaction tx = pm.currentTransaction();
        try {
            tx.begin();
            pm.deletePersistent(pojo);
            tx.commit();
        } catch (Throwable th) {
            log.error("delete", th);
            return false;
        } finally {
            if (tx.isActive()) {
                tx.rollback();
                return false;
            }
        }
        return true;
    }

    public List<T> findAll(String businessAccountId) {
        return findByCriteria(businessAccountId);
    }

    public void flush() {
        PersistenceManager pm = pmf.getPersistenceManagerProxy();
        pm.flush();
        pm.evictAll();
    }

    // protected methods ------------------------------------------

    protected List<T> findByCriteria(String businessAccountId, IJDOFilter... filters) {
        return findByCriteria(businessAccountId, 0, 0, null, filters);
    }

    /**
     * not legal, filters separated by || are on different fields
     * Query query = pm.newQuery(Employee.class, "lastName == 'Smith' || firstName == 'Harold'");
     */
    @SuppressWarnings("unchecked")
    protected List<T> findByCriteria(String businessAccountId, int startIndex, int maxResults, String order, IJDOFilter... filters) {
        List<T> ret = null;

        Query query = null;
        long startMilis = System.currentTimeMillis();
        PersistenceManager pm = pmf.getPersistenceManagerProxy();
        Transaction tx = pm.currentTransaction();
        try {
            tx.begin();
            query = pm.newQuery(persistentClass);
            if (maxResults > 0) {
                query.setRange(startIndex, maxResults);
            }
            if (businessAccountId != null) {
                filters = JDOFilters.createArray(
                        new IJDOFilter[]{JDOFilters.eq("businessAccountId", JDOFilters.quote(businessAccountId))},
                        filters);
            }
            query.setFilter(JDOFilters.and(filters).toString());
            if (order != null) {
                query.setOrdering(order);
            }
            ret = (List<T>) query.execute();
            tx.commit();

            if (log.isDebugEnabled()) {
                long executionTime = System.currentTimeMillis() - startMilis;
                if (executionTime > 150) {
                    log.debug("findByCriteria " + persistentClass.getSimpleName() + " took: " + (System.currentTimeMillis() - startMilis) + " ms");
                }
            }
        } catch (Throwable th) {
            log.error("findByCriteria", th);
        } finally {
            if (query != null) {
                query.closeAll();
            }
            if (tx.isActive()) {
                tx.rollback();
            }
        }
        return ret;
    }

    protected T getFirstElement(List<T> lt) {
        if (lt != null && lt.size() == 0) {
            return null;
        }
        return lt.get(0);
    }

    protected T get(Class<? extends T> clazz, String id) {
        Key k = KeyFactory.stringToKey(id);
        return get(clazz, k);
    }

    protected T get(Class<? extends T> clazz, Key key) {
        T t = null;
        PersistenceManager pm = pmf.getPersistenceManagerProxy();
        try {
            t = pm.getObjectById(clazz, key);
        } catch (JDOObjectNotFoundException jonfex) {
        }
        return t;
    }

}
