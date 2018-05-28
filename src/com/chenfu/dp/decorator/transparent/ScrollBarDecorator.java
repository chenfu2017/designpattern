package com.chenfu.dp.decorator.transparent;

public class ScrollBarDecorator extends ComponentDecorator {

	public ScrollBarDecorator(Component component) {
		super(component);
	}

	public void display() {
		this.setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		System.out.println("set the scrollbar");
	}
}