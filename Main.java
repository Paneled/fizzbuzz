import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");

        String preNum = scanner.next();

        Integer num = null;
        try {
            num = Integer.parseInt(preNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num == null){
            System.out.println("YOU DUMBASS THIS SHIT DONT WORK NIGGA");
            return;
        }

        if(num == 0){
            System.out.println("0");
        } else if (num % 3==0 && !(num % 5==0)){
            System.out.println("Fizz");
        } else if(num % 5==0 && !(num % 3==0)){
            System.out.println("Buzz");
        } else if(num % 3 ==0 && num % 5==0){
            System.out.println("FizzBuzz");
        } else{
            System.out.println(num);
        }
    }
}