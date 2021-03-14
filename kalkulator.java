import java.util.*;
public class kalkulator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        double angPer = in.nextDouble();
        System.out.print("Angka Kedua: ");
       double angKed = in.nextDouble();
        System.out.print("Which oprator (+,-,*,/): ");
        String operator = in.next();

        in.close();

        switch(operator){
            case "+":
                System.out.println(angPer+angKed);
                break;
            case "-":
                System.out.println(angPer-angKed);
                break;
            case "*":
                System.out.println(angPer*angKed);
                break;
            case "/":
                System.out.println(angPer/angKed);
                break;

        }

        
    }
}
