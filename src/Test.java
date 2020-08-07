import  java.util.*;

import static java.lang.Integer.parseInt;

public class Test {


    public static void main(String[] args) {

        String operation = null;
            System.out.println("Введите 2  целых числа: ");
            Scanner sc = new Scanner(System.in);
//        if (value1 > 0 || value1 < 10) {
            RomanNum romanNum1 = RomanNum.valueOf(sc.next());
            operation = sc.next();
            RomanNum romanNum2 = RomanNum.valueOf(sc.next());
//        }
            if (operation.equals("+")) {
                int sum = romanNum1.getValue() + romanNum2.getValue();
                System.out.println("Ответ: " + RomanNumerals(sum));
            }
            if (operation.equals("-")) {
                int sum = romanNum1.getValue() - romanNum2.getValue();
                System.out.println("Ответ: " + RomanNumerals(sum));
            }
            if (operation.equals("*")) {
                int sum = romanNum1.getValue() * romanNum2.getValue();
                System.out.println("Ответ: " + RomanNumerals(sum));
            }
            if (operation.equals("/")) {
                int sum = romanNum1.getValue() / romanNum2.getValue();
                System.out.println("Ответ: " + RomanNumerals(sum));
            } else {
                System.out.println("error!");
            }

        }



        public static String RomanNumerals ( int Int) {

            LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
//            roman_numerals.put("M", 1000);
//            roman_numerals.put("CM", 900);
//            roman_numerals.put("D", 500);
//            roman_numerals.put("CD", 400);
            roman_numerals.put("C", 100);
            roman_numerals.put("XC", 90);
            roman_numerals.put("L", 50);
            roman_numerals.put("XL", 40);
            roman_numerals.put("X", 10);
            roman_numerals.put("IX", 9);
            roman_numerals.put("V", 5);
            roman_numerals.put("IV", 4);
            roman_numerals.put("I", 1);
            String res = "";
            for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
                int matches = Int / entry.getValue();
                res += repeat(entry.getKey(), matches);
                Int = Int % entry.getValue();
            }
            return res;
        }

        public static String repeat (String s,int n){
            if (s == null) {
                return null;
            }
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(s);
            }
            return sb.toString();
        }

}




