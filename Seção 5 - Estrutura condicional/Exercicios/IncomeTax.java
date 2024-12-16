import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = myScanner.nextDouble();

        double taxa1 = 0;
        double taxa2 = 0;
        double taxa3 = 0;

        if (salario >= 2000.01 ){
            if (salario <= 3000.00 ){
                salario -= 2000.00;
                taxa1 = salario * 0.08; 
                double imposto = taxa1 + taxa2 + taxa3;
                System.out.printf("Você deverá pagar um total de impostos de: %.2f", imposto);
            }
            else if (salario >= 3000.01 && salario <= 4500.00 ){
                taxa1 = 1000 * 0.08;
                salario -= 3000.00;
                taxa2 = salario * 0.18;
                double imposto = taxa1 + taxa2 + taxa3;
                System.out.printf("Você deverá pagar um total de impostos de: %.2f", imposto);
            }
            else    {
                taxa1 = 1000 * 0.08;
                taxa2 = 1500 * 0.18;
                salario -= 4500.00;
                taxa3 = salario * 0.28;
                double imposto = taxa1 + taxa2 + taxa3;
                System.out.printf("Você deverá pagar um total de impostos de: %.2f", imposto);
            }
        }
        else{
            System.out.println("Insento");
        }

        myScanner.close();
    }

}
