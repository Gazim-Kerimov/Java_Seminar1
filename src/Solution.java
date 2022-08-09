//Написать программу вычисления n-ого треугольного числа.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        while (true){
            System.out.println("Для вычисления треугольного числа введите его номер.");
            System.out.println("Для выхода из программы введите слово exit");
            String input = reader.readLine();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            else if(isDigit(input)){
                System.out.println("Значение треугольного числа с порядковым номером " + input + " равно: ");
                System.out.println(numCount(Integer.parseInt(input)));
            }
            else{
                System.out.println("Введено некорретное значение, попробуйте снова: ");
            }
        }


    }
    public static int numCount(int a){
        double perm = 0.5*a*(a+1);
        int result;
        result = (int) perm;
        return result;

    }

    public static boolean isDigit(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}
