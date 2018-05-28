package com.chenfu.dp.decorator.transparent;

public class Client {

    public static void main(String[] args) {
        Component textBox = new TextBox();
        Component listBox = new ListBox();
        Component scrollBarDecorator = new ScrollBarDecorator(textBox);
        Component blackBorderDecorator = new BlackBorderDecorator(scrollBarDecorator);
        listBox.display();
        blackBorderDecorator.display();
    }

}
