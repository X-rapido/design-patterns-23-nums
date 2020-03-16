package com.example.实例2.hander;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Hander工厂
 */
@Component
public class ItemHandlerFactory<T> {
    private Logger logger = LoggerFactory.getLogger(ItemHandlerFactory.class);

    /**
     * 根据name生成对应的handler
     *
     * @param name
     * @return
     */
    public T generate(String name) {
        if (Objects.isNull(name)) {
            logger.error("HandlerFactory find illegal name.");
            return null;
        }
//        return (T) ContextLoaderListener.getCurrentWebApplicationContext().getBean(name);
        return null;
    }
}
