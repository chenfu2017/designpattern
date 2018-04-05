package com.chenfu.dp.Builder;

public class JavaScriptBuilder implements Builder {

	private JavaScript javaScript = new JavaScript();

	public void BuildTable(){
			javaScript.buildTable();
	}

	public void BuildText(){
			javaScript.buildText();
	}

	public String getJavaScript(){
		return javaScript.toString();
	}

}