package com.cadaver.funeral.designpattern.adapter;

/**
 * Created by mitsuo on 2015/10/13.
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String  string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
