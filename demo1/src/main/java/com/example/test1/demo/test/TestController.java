package com.example.test1.demo.test;

import com.example.test1.demo.LogConfig.TraceIdUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Mochi
 * @Description TODO
 * @Date 2020/4/20 18:59
 * @Name test.TestController
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/getList")
    @ResponseBody
    public Map<String, Object> queryList() {
        TraceIdUtils.updateTraceId(null);
        log.info("进入getList方法");
        Map<String, Object> result = new HashMap<>();
        List<DicTest> list = new ArrayList<DicTest>();
        DicTest dt = new DicTest();
        dt.setItemVal("00");
        dt.setColNameCn("测试1");
        DicTest dt1 = new DicTest();
        dt1.setItemVal("01");
        dt1.setColNameCn("测试2");
        DicTest dt2 = new DicTest();
        dt2.setItemVal("02");
        dt2.setColNameCn("测试3");
        list.add(dt);
        list.add(dt1);
        list.add(dt2);
        DicTest dt3 = new DicTest();
        dt3.setItemVal("0");
        dt3.setColNameCn("启用");
        DicTest dt4 = new DicTest();
        dt4.setItemVal("1");
        dt4.setColNameCn("禁用");
        List<DicTest> list1 = new ArrayList<>();
        list1.add(dt3);
        list1.add(dt4);
        result.put("result", list);
        result.put("dic", list1);
        log.info("result:{}", result);
        return result;
    }


    @RequestMapping(value = "/getcode", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String getcode() {
        return "forward:/index";
    }

}
