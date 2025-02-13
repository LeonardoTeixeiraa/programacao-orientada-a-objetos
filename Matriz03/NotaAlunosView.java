/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz03;

import javax.swing.JOptionPane;

/**
 *
 * @author leonardo-teixeira
 */
public class NotaAlunosView {

    public static void main(String[] args) {
        NotaAlunosDTO notaAlunosDTO = new NotaAlunosDTO();
        NotaAlunosCTR notaAlunosCTR = new NotaAlunosCTR();
        int mat[][] = new int[2][6];
        String ra = "";

        for (int i = 0; i < 2; i++) {
            ra = JOptionPane.showInputDialog("Informe o RA do aluno: ");
            for (int j = 1; j <=5; j++) {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota "+ i + " do aluno: " ));
            }
        }

    }
}
