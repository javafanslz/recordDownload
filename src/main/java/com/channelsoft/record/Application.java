package com.channelsoft.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <dl>
 * <dt> Application</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/5/23</dd>
 * </dl>
 *
 * @author lizhu
 */
@SpringBootApplication
@ComponentScan
public class Application {
    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
    }
}
