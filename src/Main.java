import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("??? ???????????? ???????? ???????????.");
        System.out.println("? ??? ????????? ? ????? ??? ?? ?????????? ???? ??????? ????????? ????? ???? ?????.");
        System.out.println("???? ? ???? ??????? ??????? ?????!");
        System.out.println("?????? ????? ?????????: " + "a (+,-,*,/) b " + "- ??????? ????????? ???????? (??? ?????!)");
        System.out.println("??????? ????? ?? 1(I) ?? 10(X):");

        String[] array = sc.nextLine().split(" ");
        String a = array[0];
        String b = array[1];
        String c = array[2];
        if (array.length != 3) {
            throw new IOException();
        }

        try {
            if (Integer.valueOf(a) > 0 && Integer.valueOf(a) <= 10) {
                if (Integer.valueOf(c) > 0 && Integer.valueOf(c) <= 10) {
                    String operation = ArOperation.calculate(a, b, c);
                    System.out.println(operation);
                } else {
                    throw new IOException();
                }
            }

        } catch (NumberFormatException e) {
            if (a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI")
                    || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) {
                a = String.valueOf(NumbRoma.Number(a));}
            else {
                throw new Exception();}
            if (c.equals("I") || c.equals("II") || c.equals("III") || c.equals("IV") || c.equals("V") || c.equals("VI")
                    || c.equals("VII") || c.equals("VIII") || c.equals("IX") || c.equals("X")) {
                c = String.valueOf(NumbRoma.Number(c));
                String operation = ArOperation.calculate(a, b, c);
                String result = IntegerRoma.toRoman(Integer.parseInt(operation));
                System.out.println(result);
            } else {
                throw new Exception();
            }
        }
    }
}



