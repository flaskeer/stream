package com.asterisk.stream.route;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author donghao
 * @version 1.0
 *          2017/6/6.
 */
@Component("myBean")
public class SampleBean {

    @Value("${greeting}")
    private String say;

    public String saySomething() {
        return say;
    }

}
