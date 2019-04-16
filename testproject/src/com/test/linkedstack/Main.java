package com.test.linkedstack;


public class Main {

    public static void main(String[] args) {
        LinkStack ls = new LinkStack();
        ls.initStack();
        ls.push(1);
        ls.push(2);
        ls.push(3);
        ls.print();
        ls.pop();
        ls.pop();
        ls.print();
    }
}
