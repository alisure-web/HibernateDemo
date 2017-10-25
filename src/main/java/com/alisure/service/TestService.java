package com.alisure.service;

import com.alisure.dao.TestDao;
import com.alisure.model.TTestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by ALISURE on 2017/4/30.
 */
@Service("testService")
@Transactional
public class TestService {
    @Autowired
    private TestDao testDao;

    public int saveTTestEntity(TTestEntity tTestEntitiy) {
        return  testDao.save(tTestEntitiy);
    }

    public List<TTestEntity> getAllTTestEntity() {
        return testDao.findAll();
    }
}
