package com.chenfu.dp.interpreter;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Context context = new Context("YYYY-MM-DD");
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        String[] strArray = context.getStrExpression().split("-");
        for (String s: strArray) {
            switch (s) {
                case "MM":  list.add(new MonthExpression());
                case "DD":  list.add(new DayExpression());
                case "YYYY":list.add(new YearExpression());

            }
        }
        for (AbstractExpression e:list) {
            e.evaluate(context);
        }
        System.out.println(context.getStrExpression());
    }
}
