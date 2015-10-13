package com.cadaver.funeral.designpattern.adapter;

/**
 * Created by mitsuo on 2015/10/13.
 */
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String  string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
