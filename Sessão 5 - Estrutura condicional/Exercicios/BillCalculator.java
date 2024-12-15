import java.util.Scanner;
public class BillCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("--- Bem vindo(a) ---");
        System.out.println("1.  Produto 1    R$ 2,00");
        System.out.println("2.  Produto 2    R$ 3,00");
        System.out.println("3.  Produto 3    R$ 4,00");
        System.out.println("4.  Produto 4    R$ 5,00");
        System.out.print("Digite o número correspondente ao produto que você deseja: ");
        int Produto = myScanner.nextInt();
        System.out.print("Digite a quantidade do produto que você deseja: ");
        int qntProduto = myScanner.nextInt();

        if (Produto == 1){
            System.out.printf("O total da sua compra foi: R$"+(2 * qntProduto));
        }
        else if (Produto == 2){
            System.out.printf("O total da sua compra foi: R$"+(3 * qntProduto));
        }
        else if (Produto == 3){
            System.out.printf("O total da sua compra foi: R$"+(4 * qntProduto));
        }
        else{
            System.out.printf("O total da sua compra foi: R$"+(5* qntProduto));
        }

        myScanner.close();
    }
}
