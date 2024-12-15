import java.util.Scanner;
public class PositiveOrNegative{
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = myScanner.nextInt();
        if (num > 0){
            System.out.printf("O número %d é positivo", num);
        }
        else if (num == 0){
            System.out.println("O número digitado é 0");
        }
        else{
            System.out.printf("O número %d é negativo", num);
        }
        myScanner.close();
    }
}
