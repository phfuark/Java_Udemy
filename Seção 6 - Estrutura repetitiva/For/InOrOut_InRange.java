import java.util.Scanner;

public class InOrOut_InRange {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores 'x', e descubra se eles estão no intervalo  [10,20]: ");
        int num = myScanner.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 1; i <= num; i++){
            System.out.printf("Digite o valor %d: ", i);
            int x = myScanner.nextInt();
            if (10 <= x && x <= 20){
                in += 1;
            }
            else{
                out += 1;
            }
        }
        System.out.printf("%d in\n%d out", in, out);

        myScanner.close();
    }
}
