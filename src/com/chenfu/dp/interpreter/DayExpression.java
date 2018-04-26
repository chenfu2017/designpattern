package com.chenfu.dp.interpreter;

import java.util.Calendar;

public class DayExpression implements AbstractExpression {
    @Override
    public void evaluate(Context context) {
        Integer day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        String s = context.getStrExpression().replaceAll("DD",day.toString());
        context.setStrExpression(s);
    }
}
