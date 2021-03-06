package calc;

import javax.swing.JTextField;

public class Processador {
    
    /**
     * Adiciona um número na tela.
     * 
     * @param tela
     * @param num Número a ser adicionado.
     */
    public static void addNumTela(JTextField tela, int num) {
        
        String tela_cache = tela.getText();
        
        if( "0".equals(tela_cache)) {
            tela_cache = "";
        }
        
        tela.setText(tela_cache + Integer.toString(num));
        
    }
    
    /**
     * Soma dois numeros
     * 
     * @param num1
     * @param num2
     * @return Soma dos números
     */
    public static long somar(long num1, long num2) {
     
        return num1 + num2;
        
    }
    
    /**
     * Subtração
     * 
     * @param num1
     * @param num2
     * @return Resultado da subtração
     */
    public static long subtrair(long num1, long num2) {
        
        return num1 + num2;
        
    }
    
    /**
     * Multiplicação
     * 
     * @param num1
     * @param num2
     * @return Resultado da multiplicação
     */
    public static long multiplicar(long num1, long num2) {
        
        return num1 * num2;
        
    }
    
    /**
     * Divisão
     * 
     * @param num1
     * @param num2
     * @return  Resultado da divisão
     */
    public static long dividir(long num1, long num2) {
        
        return num1 / num2;
        
    }
    
}
