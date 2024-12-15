import java.util.Scanner;
public class GameLength {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Digite o horário de início do jogo: ");
        int horarioInicio = myScanner.nextInt();
        System.out.print("Digite o horário de térimino do jogo: ");
        int horarioTermino = myScanner.nextInt();

        if (horarioInicio < horarioTermino){
            int duracaoJogo = horarioTermino - horarioInicio;
            System.out.printf("O jogo teve a duração de %d(horas)", duracaoJogo);
        }
        else{
            int duracaoJogo = 24 - horarioInicio + horarioTermino;
            System.out.printf("O jogo teve a duração de %d(horas)", duracaoJogo);
        }

        myScanner.close();
    }
}

