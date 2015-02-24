package com.numhero.server.model.dao;

import com.numhero.server.model.dao.filter.IJDOFilter;
import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.Searchable;
import com.numhero.server.search.IsSearchable;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseSearchableDao<T extends Searchable> extends BaseDao<T> {

    private static Log log = LogFactory.getLog(BaseSearchableDao.class);

    public BaseSearchableDao() {
    }

    public boolean save(T pojo) {
        PersistenceManager pm = pmf.getPersistenceManagerProxy();
        Transaction tx = pm.currentTransaction();
        try {
            tx.begin();
            addSearchInfo(pojo);
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

    public List<T> searchForStartsWith(String startWith, int maxResults, String businessAccountId, IJDOFilter... f) {
        startWith = startWith.toLowerCase().trim();
        IJDOFilter[] filters = JDOFilters.createArray(f,
                JDOFilters.ge(Searchable.ATTRIBUTE_STARTS_WITH_SEARCH, JDOFilters.quote(startWith)),
                JDOFilters.ls(Searchable.ATTRIBUTE_STARTS_WITH_SEARCH, JDOFilters.quote(startWith + "\ufffd")));
        return findByCriteria(businessAccountId, 0, maxResults, null, filters);
    }

    public List<T> search(String text, String businessAccountId, IJDOFilter... filters) {
        List<T> ret;
        List<String> tokens = textTokenizer.getTokens(text);
        if (!tokens.isEmpty()) {
            int length = tokens.size() > 30 ? 30 : tokens.size();
            IJDOFilter[] textFilters = new IJDOFilter[length];
            for (int i = 0; i < length; i++) {
                textFilters[i] = JDOFilters.eq(Searchable.ATTRIBUTE_WORD_SEARCH, JDOFilters.quote(tokens.get(i)));
            }
            filters = JDOFilters.createArray(filters, JDOFilters.or(textFilters));
            ret = findByCriteria(businessAccountId, filters);
        } else {
            ret = new ArrayList<T>();
        }
        return ret;
    }

    // protected methods ------------------------------------------
    protected void addSearchInfo(T pojo) {
        StringBuffer searchWords = new StringBuffer();
        for (Field field : persistentClass.getDeclaredFields()) {
            IsSearchable annotation = field.getAnnotation(IsSearchable.class);
            if (annotation != null) {
                Object fieldValue = null;
                try {
                    fieldValue = field.get(pojo);
                } catch (IllegalAccessException iaex) {
                    try {
                        fieldValue = BeanUtils.getSimpleProperty(pojo, field.getName());
                    } catch (Exception ignore) {
                    }
                } catch (Exception ignore) {
                }
                if (fieldValue != null) {
                    boolean byStartsWith = annotation.byStartWith();
                    if (byStartsWith) {
                        pojo.setLowerCaseForByStartsWithSearch(fieldValue.toString().toLowerCase().trim());
                    }

                    searchWords.append(fieldValue);
                    searchWords.append(' ');
                }
            }
        }
        for (Method method : persistentClass.getDeclaredMethods()) {
            // check only the getters
            if (!method.isSynthetic() &&
                    !method.isBridge() &&
                    !Modifier.isStatic(method.getModifiers()) &&
                    method.getParameterTypes().length == 0 &&
                    method.getReturnType() != void.class &&
                    (method.getName().startsWith("get") || method.getName().startsWith("is"))) {
                IsSearchable annotation = method.getAnnotation(IsSearchable.class);
                if (annotation != null) {
                    try {
                        Object fieldValue = method.invoke(pojo);
                        if (fieldValue != null) {
                            searchWords.append(fieldValue);
                            searchWords.append(' ');
                        }
                    } catch (Exception ignore) {
                    }
                }
            }
        }
        pojo.setWordsForSearch(textTokenizer.getTokens(searchWords.toString()));
    }
}
