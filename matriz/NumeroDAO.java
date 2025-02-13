/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

/**
 *
 * @author leonardo-teixeira
 */
public class NumeroDAO {
    public String mostrarMatriz(NumeroDTO numeroDTO) {
        String resposta = "";
        int n[][] = numeroDTO.getN();
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                resposta += n[linha][coluna] + " ";
            }
            resposta += "\n";
        }
        return resposta;
    }
}