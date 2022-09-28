package com.kuang.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fee();
    }
    //看房
    public void seeHouse(){
        System.out.println("中介带你去看房子");
    }
    //签合同
    public void hetong(){
        System.out.println("签合同");
    }
    //收中介费
    public void fee(){
        System.out.println("收中介费");
    }
}
