package com.chenfu.dp.interpreter;

import java.util.Calendar;

public class YearExpression implements AbstractExpression {
    @Override
    public void evaluate(Context context) {
        Integer year = Calendar.getInstance().get(Calendar.YEAR);
        String s = context.getStrExpression().replaceAll("YYYY",year.toString());
        context.setStrExpression(s);
    }
}
