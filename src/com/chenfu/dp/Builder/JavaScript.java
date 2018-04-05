package com.chenfu.dp.Builder;

public class JavaScript {

	private String table;
    private String text;
    public void buildTable() {
        table="javascript table";
    }
    public void buildText() {
        text="javascript text";
    }

	@Override
	public String toString() {
		return "JavaScript{" +
				"table='" + table + '\'' +
				", text='" + text + '\'' +
				'}';
	}
}