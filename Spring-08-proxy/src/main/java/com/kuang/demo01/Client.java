package com.kuang.demo01;

public class Client {
    public static void main(String[] args) {
//        Host host =new Host();
//        host.rent();

        //房东要租房子
        Host host=new Host();
        //代理，中介帮房东租房子，但是呢？代理一般会有一些附属操作！
        Proxy proxy = new Proxy(host);

        //你不用面对房东，直接找中介租房既可。
        proxy.rent();

    }
}
