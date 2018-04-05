package com.chenfu.dp.Builder;

public class Director {

	private Builder m_builder;

	public void construct(Builder builder){
		m_builder=builder;
		m_builder.BuildText();
		m_builder.BuildTable();
	}

}