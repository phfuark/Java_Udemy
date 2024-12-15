import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Digite um número, e descubra se ele é par ou ímpar: ");
        int num = myScanner.nextInt();
        if (num % 2 == 0){
            System.out.printf("O número %d é par!", num);
        }
        else if (num == 0){
            System.out.println("O número digitado é 0");
        }
        else{
            System.out.printf("O número %d é ímpar!", num);
        }
        myScanner.close();
    }
}
