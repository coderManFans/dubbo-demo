package com.coderFans.dubboserver;

/**
 * Created by ${fanchunshuai} on 2016-8-11.
 *
 * @version: V1.0
 * @Desc:
 * @Copyright (c) 2016 58到家-版权所有
 */
public class ServerInterfaceImpl implements ServerInterface {
    public String  sayHello(String helloWorld) {
        return "hello:"+helloWorld;
    }
}
