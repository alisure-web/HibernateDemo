package com.alisure.controller;

import com.alisure.model.TTestEntity;
import com.alisure.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ALISURE on 2017/4/30.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, String> json(){
        Map<String, String> result = new HashMap<String, String>();
        result.put("MarK", "hello");
        result.put("Ken", "Hehe");
        result.put("Fowafolo", "fool");
        return result;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<TTestEntity> getAllTTestEntity(){
        return testService.getAllTTestEntity();
    }

    @RequestMapping("/save/{name}/{age]")
    @ResponseBody
    public int getAllTTestEntity(@PathVariable String name, @PathVariable Integer age){
        if(name == null || "".equals(name)) return -1;
        if(age == null) return -1;
        TTestEntity tTestEntity = new TTestEntity();
        tTestEntity.setName(name);
        tTestEntity.setAge(age);
        return testService.saveTTestEntity(tTestEntity);
    }
}
