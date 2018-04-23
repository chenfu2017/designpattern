package com.chenfu.dp.abstractfactory;

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button CreateButton() {
        return new SummerButton();
    }

    @Override
    public Textarea CreatTextarea() {
        return new SummerTextarea();
    }
}
