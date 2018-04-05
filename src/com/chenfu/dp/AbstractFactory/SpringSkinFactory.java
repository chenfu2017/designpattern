package com.chenfu.dp.AbstractFactory;

public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button CreateButton() {
        return new SpringButton();
    }

    @Override
    public Textarea CreatTextarea() {
        return new SpringTextarea();
    }
}
