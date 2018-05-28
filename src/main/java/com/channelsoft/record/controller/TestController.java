package com.channelsoft.record.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dt> TestController</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/5/26</dd>
 * </dl>
 *
 * @author lizhu
 */
@RestController
public class TestController {
    @Value("$(user.name)")
    private String testName;
    @Value("$(user.password)")
    private String testPassword;
    @RequestMapping("/")
    public String index(){
        return testName+"@@"+testPassword;
    }
}
