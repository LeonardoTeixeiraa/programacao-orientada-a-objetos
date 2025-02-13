/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;
import javax.swing.JOptionPane;
/**
 *
 * @author leonardo-teixeira
 */
import javax.swing.JOptionPane;

public class NumeroView {
    public static void main(String[] args) {
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        int num[][] = new int[2][3];

        try {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    num[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Informe o número da linha " + i + " Coluna " + j));
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira apenas números inteiros.");
            return;
        }

        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.mostrarMatriz(numeroDTO));
    }
}