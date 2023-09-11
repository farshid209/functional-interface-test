package org.example;

import org.example.interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //1. StringOperation usage
        StringOperation obj1 = new StringOperation() {
            @Override
            public String performOperation(String str) {
                return str + " Jan";
            }
        };

        String result1 = obj1.performOperation("Farshid");
        System.out.println(result1);

        //2. MathOperation usage
        MathOperation obj2 = new MathOperation() {
            @Override
            public double performOperation(double a, double b) {
                return a + b;
            }
        };

        double result2 = obj2.performOperation(4.9, 9.8);
        System.out.println(result2);

        //3. NumberPredicate usage
        NumberPredicate obj3 = new NumberPredicate() {
            @Override
            public boolean test(int num) {
                if (num % 2 == 0) {
                    return true;
                }
                return false;
            }
        };

        int[] intArr = {65, 90, 77, 98, 53, 41, 72, 12};

        for (int i = 0; i < intArr.length; i++) {
            boolean check = obj3.test(intArr[i]);
            if (check == true) {
                System.out.print(intArr[i] + " ");
            }
        }
        System.out.println();


        //4. Predicate usage
        Predicate<String> obj4 = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                if (value.length() > 5) {
                    return true;
                }
                return false;
            }
        };

        String[] strArr = {"Ali", "Maryam", "Farshid", "Ehsan", "Dani"};

        for (int i = 0; i < strArr.length; i++) {
            boolean check = obj4.test(strArr[i]);
            if (check == true) {
                System.out.print(strArr[i] + " ");
            }
        }
        System.out.println();

        //5. ListAggregator usage
        ListAggregator<Integer, Integer> obj5 = new ListAggregator<Integer, Integer>() {
            @Override
            public Integer aggregate(List<Integer> list) {
                Integer sumResult = 0;
                for (Integer temp : list) {
                    sumResult = sumResult + temp;
                }
                return sumResult;
            }
        };

        List<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(900);
        intList.add(546);
        intList.add(10);
        intList.add(67);

        Integer result5 = obj5.aggregate(intList);
        System.out.println(result5);

        //6. Supplier usage
        Supplier<String> obj6 = new Supplier<String>() {
            @Override
            public String get() {
                String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                StringBuilder sb = new StringBuilder();
                Random random = new Random();

                for (int i = 0; i < 16; i++) {
                    int index = random.nextInt(chars.length());
                    char ch = chars.charAt(index);
                    sb.append(ch);
                }
                return sb.toString();
            }
        };

        String password = obj6.get();
        System.out.println(password);

    }
}