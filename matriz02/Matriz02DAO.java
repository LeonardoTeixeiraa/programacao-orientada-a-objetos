/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz02;

/**
 *
 * @author leonardo-teixeira
 */
public class Matriz02DAO {

    String resposta = "";

    public String mostrarMatriz(Matriz02DTO numeroDTO) {
        int n[][] = numeroDTO.getMatriz();
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (coluna != linha) {
                    this.resposta += "  ";

                    continue;
                }
                this.resposta += n[linha][coluna] + "  ";

            }

            this.resposta += "\n";
        }
        return this.resposta;
    }
}
