/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author leonardo-teixeira
 */
public class NumeroView {
    public static void main(String [] args){
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        
        int num[] = new int [5];
        
        for(int cont=0; cont < 5; cont++){
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero para a posição "+ cont));
            
        }
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.verificarPosicao(numeroDTO));
    }
}
