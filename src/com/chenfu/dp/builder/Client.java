package com.chenfu.dp.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        HtmlBuilder htmlBuilder = new HtmlBuilder();
        director.construct(htmlBuilder);
        System.out.println(htmlBuilder.getHtml());
        JavaScriptBuilder javaScriptBuilder = new JavaScriptBuilder();
        director.construct(javaScriptBuilder);
        System.out.println(javaScriptBuilder.getJavaScript());
    }
}
