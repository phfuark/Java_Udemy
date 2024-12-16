import java.util.Scanner;
public class MultipleOrNon {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Digite o número 1: ");
        int num1 = myScanner.nextInt();
        System.out.print("Digite o número 2: ");
        int num2 = myScanner.nextInt();

        int maiorNum, menorNum; 
        float div;
        if (num1 > num2){
            div = num1%num2;
            maiorNum = num1;
            menorNum = num2;
        }
        else{
            div = num2%num1;
            maiorNum = num2;
            menorNum = num1;
        }
        if (div == 0){
            System.out.printf("O número %d é múltiplo de %d!", maiorNum, menorNum);
        }
        else{
            System.out.printf("O número %d não é múltiplo de %d!", maiorNum, menorNum);
        }
        
        myScanner.close();
    }
}
