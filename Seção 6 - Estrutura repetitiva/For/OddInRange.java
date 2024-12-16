import java.util.Scanner;

public class OddInRange{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int num = 0;
        while (1 > num || num > 1000) {
            System.out.print("Digite um número entre o periodo 1 <= X <= 1000: ");
            num = myScanner.nextInt();
        }

        for (int i = 0; i <= num; i++){
            if (i%2 == 1){
                System.out.println(i);
            }
        }
        myScanner.close();
    }
}