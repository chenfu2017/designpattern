package com.chenfu.dp.abstractfactory;

public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory = new SummerSkinFactory();
        Button button = skinFactory.CreateButton();
        button.show();
        skinFactory= new SpringSkinFactory();
        Textarea textarea = skinFactory.CreatTextarea();
        textarea.show();

    }
}
