/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
     
    public String MediaAritmetica(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        double suma = 0.0;
        int totalFrecuencias = 0;

        
        for (int i = 0; i < model.getRowCount(); i++) {
            double marcaClase = (Double) model.getValueAt(i, 2);
            int frecuencia = (Integer) model.getValueAt(i, 1);

            suma += marcaClase * frecuencia; // Multiplicar marca de clase por frecuencia
            totalFrecuencias += frecuencia; // Sumar frecuencias
        }

        // Calcular y retornar la media
        if (totalFrecuencias > 0) {
            double media = suma / totalFrecuencias; 
            
            DecimalFormat df = new DecimalFormat("#.###");
            return df.format(media);
        } else {
            return "0"; // O lanzar una excepción según lo que consideres adecuado
        }
    }
    
    public double varianzaPoblacion(JTable table, double media) {
    double sumaCuadrados = 0.0;
     int totalFrecuencias = 0;
     
    for (int i = 0; i < table.getRowCount(); i++) {
        double marcaClase = (double) table.getValueAt(i, 2);
        int frecuencia = (int) table.getValueAt(i, 1);
        
        sumaCuadrados += (Math.pow(marcaClase, 2) * frecuencia);
        totalFrecuencias += frecuencia;
    }
    
    double varianza = (sumaCuadrados / totalFrecuencias) - Math.pow(media, 2);
    return varianza;
    }
    
    
    public double varianzaMuestra(JTable table, double media) {
    double sumaCuadrados = 0.0;
    int totalFrecuencias = 0;
    for (int i = 0; i < table.getRowCount(); i++) {
        double marcaClase = (double) table.getValueAt(i, 2);
        int frecuencia = (int) table.getValueAt(i, 1);
        
        sumaCuadrados += (Math.pow(marcaClase, 2) * frecuencia);
        totalFrecuencias += frecuencia;
    }
    
    double varianza = (sumaCuadrados / (totalFrecuencias - 1)) - Math.pow(media, 2);
    return varianza;
    }
    
    public double CoeficienteVariacion(double desviacionEstandar, double media){
        double coeficiente;
        coeficiente = (desviacionEstandar / media) * 100;
        return coeficiente;
    }
}
