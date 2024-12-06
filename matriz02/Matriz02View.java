/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz02;

import javax.swing.JOptionPane;

/**
 *
 * @author leonardo-teixeira
 */
public class Matriz02View {

    public static void main(String[] args) {
        Matriz02DTO matriz02DTO = new Matriz02DTO();
        Matriz02CTR matriz02CTR = new Matriz02CTR();
        int num[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha " + i + " Coluna " + j));
            }
        }
        matriz02DTO.setMatriz(num);
        JOptionPane.showMessageDialog(null, matriz02CTR.mostrarMatriz(matriz02DTO));
    }
}
