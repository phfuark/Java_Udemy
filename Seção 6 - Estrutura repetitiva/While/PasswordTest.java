import java.util.Scanner;
public class PasswordTest {
    public static void main (String [] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Crie uma senha(número): ");
        int senha = myScanner.nextInt();
        
        System.out.print("Digite a senha(número): ");
        int tentativa = myScanner.nextInt();
        while (tentativa != senha){
            System.out.print("Senha errada, tente novamente: ");
            tentativa = myScanner.nextInt();
        }
        System.out.print("Senha correta!");
        myScanner.close();
    }
}
