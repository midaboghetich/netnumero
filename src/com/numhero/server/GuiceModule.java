package com.numhero.server;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;
import com.numhero.server.auth.MD5EncryptionServiceImpl;
import com.numhero.server.auth.OneWayEncryptionService;
import com.numhero.server.command.CommandProcessor;
import com.numhero.server.command.ICommandProcessor;
import com.numhero.server.model.dao.*;
import com.numhero.server.model.pojo.*;
import com.numhero.server.search.PorterStemAnalyzer;
import org.apache.lucene.analysis.Analyzer;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;
import java.util.HashMap;
import java.util.Map;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(new TypeLiteral<BaseDao<User>>() {
        }).to(UserDao.class);
        bind(new TypeLiteral<BaseDao<Invoice>>() {
        }).to(InvoiceDao.class);
        bind(new TypeLiteral<BaseDao<BusinessAccount>>() {
        }).to(BusinessAccountDao.class);
        bind(new TypeLiteral<BaseDao<BankAccount>>() {
        }).to(BankAccountDao.class);
        bind(new TypeLiteral<BaseDao<Product>>() {
        }).to(ProductDao.class);
        bind(new TypeLiteral<BaseDao<ClientSupplier>>() {
        }).to(ClientSupplierDao.class);
        bind(new TypeLiteral<BaseDao<Project>>() {
        }).to(ProjectDao.class);
        bind(new TypeLiteral<BaseDao<Task>>() {
        }).to(TaskDao.class);
        bind(new TypeLiteral<BaseDao<ProjectStaffDetail>>() {
        }).to(ProjectStaffDetailDao.class);
        bind(new TypeLiteral<BaseDao<ProjectTaskDetail>>() {
        }).to(ProjectTaskDetailDao.class);
        bind(new TypeLiteral<BaseDao<TaskStaffDetail>>() {
        }).to(TaskStaffDetailDao.class);

        bind(ICommandProcessor.class).to(CommandProcessor.class);
        bind(OneWayEncryptionService.class).to(MD5EncryptionServiceImpl.class);
    }

    @Provides
    @Singleton
    PersistenceManagerFactory getPersistenceManagerFactory() {
        Map<String, String> props = new HashMap<String, String>();
        props.put("javax.jdo.PersistenceManagerFactoryClass", "org.datanucleus.store.appengine.jdo.DatastoreJDOPersistenceManagerFactory");
        props.put("javax.jdo.option.ConnectionURL", "appengine");
        props.put("javax.jdo.option.NontransactionalRead", "true");
        props.put("javax.jdo.option.NontransactionalWrite", "true");
        props.put("javax.jdo.option.RetainValues", "true");
        props.put("javax.jdo.option.TransactionType", "RESOURCE_LOCAL");
        props.put("datanucleus.appengine.autoCreateDatastoreTxns", "true");
        props.put("datanucleus.appengine.attachSameDatastore", "true");

        PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory(props);
        return pmf;
    }

    @Provides
    @Singleton
    Analyzer getAnalyzer() {
        // This is just English for now
        return new PorterStemAnalyzer();
    }
}
