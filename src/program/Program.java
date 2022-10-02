/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;
import java.util.Scanner;
import util.Convert;
import java.util.Locale;
/**
 *
 * @author Jfc01
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        
        
        System.out.print("What is the dollar price? ");
        double valorDolar = tc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double valorDesejado = tc.nextDouble();
        double valor = Convert.currencyConverter(valorDolar, valorDesejado);
        
        System.out.printf("Amount to be paid in Reais: %.2f \n", valor);
        
        tc.close();
    }
    
}
