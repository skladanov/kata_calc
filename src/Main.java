import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception{
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println(calc(sc.nextLine()));
        }
        catch (Exception e){
            throw e;
        }
    }


    public static String calc(String input) throws Exception{
        int a, b;
        String act = null;
        String result = null;
        String [] arr = input.split(" ");
        if (arr.length != 3) throw new Exception("строка не является математической операцией");
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[2]);
        if (a < 1 | a > 10 | b < 1 | b > 10) throw new Exception("один из операндов вне интервала [1; 10]");
        act = arr[1];
        switch (act) {
            case ("+") -> result = "" + (a + b);
            case ("-") -> result = "" + (a - b);
            case ("*") -> result = "" + (a * b);
            case ("/") -> result = "" + (a / b);
            default -> throw new IllegalStateException("Недопустимый оператор \"" + act + "\". Используйте +, -, /, *");
        }
        return "" + result;
    }
}