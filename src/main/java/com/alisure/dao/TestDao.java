package com.alisure.dao;

import com.alisure.model.TTestEntity;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ALISURE on 2017/4/30.
 */
@Repository("testDao")
public class TestDao {
    @Autowired
    private SessionFactory sessionFactory;

    public int save(TTestEntity tTestEntity){
        return (Integer)sessionFactory.getCurrentSession().save(tTestEntity);
    }

    public List<TTestEntity> findAll(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TTestEntity.class);
        return  criteria.list();
    }
}
