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
    
}
