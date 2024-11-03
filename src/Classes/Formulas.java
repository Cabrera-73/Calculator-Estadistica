/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.math.BigInteger;
import java.util.Scanner;

public class Formulas {
    
    
   public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    
    public BigInteger permutacion(int n, int k) {
        return factorial(n).divide(factorial(n - k));
    }
    
    public  BigInteger combinacion(int n, int k) {
    return factorial(n).divide(factorial(k).multiply( factorial(n - k)));
}
    
     public  BigInteger permutacionConClases(int n, int[] clases) {
        BigInteger numerador = factorial(n);
        BigInteger denominador = BigInteger.ONE;

        for (int clase : clases) {
            denominador = denominador.multiply(factorial(clase));
        }

        return numerador.divide(denominador);
    }
    
    
}
