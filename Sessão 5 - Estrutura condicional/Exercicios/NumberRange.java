import java.util.Scanner;
public class NumberRange{
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = myScanner.nextFloat();

        if (num >= 0 && num <= 25){
            System.out.printf("O número %f.2f está dentro do intervalo [0, 25]", num);
        }
        else if (num >= 26 && num <= 50){
            System.out.printf("O número %f.2f está dentro do intervalo [26, 50]", num);
        }
        else if (num >= 51 && num <= 75){
            System.out.printf("O número %f.2f está dentro do intervalo [51, 75]", num);
        }
        else if (num >= 76 && num <= 100){
            System.out.printf("O número %f.2f está dentro do intervalo [76, 100]", num);
        }
        else{
            System.out.printf("O número %f.2f não está dentro de nenhhum intervalo", num);
        }
        myScanner.close();
    }
}