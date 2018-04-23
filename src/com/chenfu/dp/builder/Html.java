package com.chenfu.dp.builder;

public class Html {


	private String table;
	private String text;
	public void bulidTable() {
		table="html table";
	}
	public void buildText() {
		text="html text";
	}

	@Override
	public String toString() {
		return "Html{" +
				"table='" + table + '\'' +
				", text='" + text + '\'' +
				'}';
	}
}