package com.aidebar.greendaotest.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.lenovo.test_sql.DB.DBStepEveryDayCountBean;

import com.aidebar.greendaotest.gen.DBStepEveryDayCountBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dBStepEveryDayCountBeanDaoConfig;

    private final DBStepEveryDayCountBeanDao dBStepEveryDayCountBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dBStepEveryDayCountBeanDaoConfig = daoConfigMap.get(DBStepEveryDayCountBeanDao.class).clone();
        dBStepEveryDayCountBeanDaoConfig.initIdentityScope(type);

        dBStepEveryDayCountBeanDao = new DBStepEveryDayCountBeanDao(dBStepEveryDayCountBeanDaoConfig, this);

        registerDao(DBStepEveryDayCountBean.class, dBStepEveryDayCountBeanDao);
    }
    
    public void clear() {
        dBStepEveryDayCountBeanDaoConfig.clearIdentityScope();
    }

    public DBStepEveryDayCountBeanDao getDBStepEveryDayCountBeanDao() {
        return dBStepEveryDayCountBeanDao;
    }

}