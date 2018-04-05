package com.chenfu.dp.Builder;

public class HtmlBuilder implements Builder {

	private Html html = new Html();

	public void BuildTable(){
			html.bulidTable();
	}

	public void BuildText(){
			html.buildText();
	}

	public String getHtml(){
		return html.toString();
	}

}