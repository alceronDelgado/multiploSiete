/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplo7;

/**
 *
 * @author lalej
 * Objetivo = cree un arreglo con números aleatorios y evalue si son multiplos de 7 y muestre en pantalla
 */
import java.util.Scanner;
public class Multiplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cuantos números desea ingresar?");
        int n = entrada.nextInt();
        int numeros [] = new int[n];
        int valoresDigitados [] = new int[n];
        int i = 0;
        int valor;
        String resultados = " ";
        
        while(true){
            
            if(i >= n){
                break;
            }else{
                System.out.println("Digite el valor: #"+(i+1));
                valor = entrada.nextInt();
                valoresDigitados[i] = valor;
                resultados += "\n"+"Valores Digitados: "+valoresDigitados[i];
                if(valoresDigitados[i] % 7 == 0){
                   numeros[i] = valor;
                }
                i+=1;
            }
        }
        
        for(int k =0;k<numeros.length;k++){
            if(numeros[k] != 0){
                resultados += "\n"+"Los multiplos de 7 son: "+numeros[k];
            }
        }
        System.out.println(resultados);

    }
    
}
