import java.util.Scanner;
public class GasStationBill {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("--- Bem vindo(a) ---");
        System.out.println("1.  Álcool");
        System.out.println("2.  Gasolina");
        System.out.println("3.  Diesel");
        System.out.print("Digite o número correspondente ao produto que você deseja, ou digite '4' para sair: ");
        int escolha = myScanner.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (escolha != 4){
            if (escolha == 1){
                System.out.println("Você escolheu Álcool!");
                alcool +=1;
                System.out.print("Digite o número correspondente ao produto que você deseja, ou digite '4' para sair: ");
                escolha = myScanner.nextInt();
            }
            else if (escolha == 2){
                System.out.println("Você escolheu Gasolina!");
                gasolina+=1;
                System.out.print("Digite o número correspondente ao produto que você deseja, ou digite '4' para sair: ");
                escolha = myScanner.nextInt();
            }
            else if (escolha == 3){
                System.out.println("Você escolheu Diesel!");
                diesel+=1;
                System.out.print("Digite o número correspondente ao produto que você deseja, ou digite '4' para sair: ");
                escolha = myScanner.nextInt();
            }
        }
        System.out.println("--- Muito Obrigado! ---");
        System.out.printf("Álcool:   %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel:   %d\n", diesel);

        myScanner.close();
    }
}
