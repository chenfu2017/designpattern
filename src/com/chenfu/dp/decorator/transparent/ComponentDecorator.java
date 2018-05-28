package com.chenfu.dp.decorator.transparent;

public class ComponentDecorator extends Component {
	private Component component;

	public ComponentDecorator(Component component) {
		this.component = component;
	}

	public void display() {
		component.display();
	}
}