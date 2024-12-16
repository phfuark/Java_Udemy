import java.util.Scanner;

public class WeightedAverageInGroups{
    public static void main (String[]agrs){
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Digite o número de conjuntos: ");
        int conjuntos = myScanner.nextInt();

        for (int i = 1; i <= conjuntos; i++){
            System.out.printf("Digite o número 1 do conjunto %d: ", i);
            float num1 = myScanner.nextFloat();

            System.out.printf("Digite o número 2 do conjunto %d: ", i);
            float num2 = myScanner.nextFloat();

            System.out.printf("Digite o número 3 do conjunto %d: ", i);
            float num3 = myScanner.nextFloat();

            num1 *= 2;
            num2 *= 3;
            num3 *= 5;

            float media = (num1+num2+num3)/3;

            System.out.printf("A média ponderada do conjunto %d é: %.1f \n", i, media);
        }
        myScanner.close();
    }
}