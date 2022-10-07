import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).



        Scanner teclado = new Scanner(System.in);

        double c, f;
  
        System.out.println("Informe a temperatura em Fahrenheit: ");
        f = teclado.nextDouble();
  
        c = 5 * ((f-32) / 9);
  
        teclado.close();
  
        System.out.print(" A temperatura em graus Celsius é: "+ c);  
    }
}
