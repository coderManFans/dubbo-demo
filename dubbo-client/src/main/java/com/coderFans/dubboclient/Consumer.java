package com.coderFans.dubboclient;

import com.coderFans.dubboserver.ServerInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ${fanchunshuai} on 2016-8-11.
 *
 * @version: V1.0
 * @Desc:
 * @Copyright (c) 2016 58到家-版权所有
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        ServerInterface serverInterface = (ServerInterface) context.getBean("serverInterface");
        String hello = serverInterface.sayHello(" world");
        System.out.println("in = "+hello);
    }

}
