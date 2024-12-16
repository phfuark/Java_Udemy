import java.util.Scanner;
public class CartesianCoordinate {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Digite um x: ");
        double x = myScanner.nextDouble();
        System.out.print("Digite um y: ");
        double y = myScanner.nextDouble();

        if (x == 0.0 && y == 0.0){
            System.out.println("Eixo origem");
        }   
        else if (x > 0.0 && y > 0.0){
            System.out.println("Q1");
        }  
        else if (x < 0.0 && y > 0.0){
            System.out.println("Q2");
        }  
        else if (x < 0.0 && y < 0.0){
            System.out.println("Q3");
        }
        else if (x > 0.0 && y < 0.0){
            System.out.println("Q4");
        }      
        else if (x == 0.0){
            System.out.println("Eixo Y");
        } 
        else if (y == 0.0){
            System.out.println("Eixo X");
        } 

        myScanner.close();
    }
}
