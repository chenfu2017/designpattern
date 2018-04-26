package com.chenfu.dp.interpreter;

import java.util.Calendar;
import java.util.Date;

public class MonthExpression implements AbstractExpression {

    @Override
    public void evaluate(Context context) {
        Integer month = Calendar.getInstance().get(Calendar.MONTH)+1;
        String s = context.getStrExpression().replaceAll("MM",month.toString());
        context.setStrExpression(s);
    }
}
