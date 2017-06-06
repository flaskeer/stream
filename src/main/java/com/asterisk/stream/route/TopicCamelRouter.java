package com.asterisk.stream.route;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author donghao
 * @version 1.0
 *          2017/6/6.
 */
@Component
@Slf4j
public class TopicCamelRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:hello?period={{timer.period}}")
                .transform(method("myBean", "saySomething"))
                .to("stream:out");
    }
}
