package com.coderFans.dubboserver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by ${fanchunshuai} on 2016-8-11.
 *
 * @version: V1.0
 * @Desc:
 * @Copyright (c) 2016 58到家-版权所有
 */
public class Provider {
    /**
     * 启动服务端，服务端将服务接口部署到zookeeper上
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provider.xml"});
        context.start();
        try {
            //按任意键退出
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
