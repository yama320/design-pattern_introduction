package com.cadaver.funeral.designpattern.adapter;

/**
 * Created by mitsuo on 2015/10/13.
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
