package com.chenfu.dp.abstractfactory;

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
