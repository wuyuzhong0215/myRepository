package com.test.extendstest;

public abstract class Atest {

    public void ready(){
        System.out.println("A:ready~");
    }

    public void go(){
        System.out.println("A:go!");
    }

    public void template(){
        ready();
        go();
    }
}
