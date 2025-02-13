/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores_Ex01;

/**
 *
 * @author leonardo-teixeira
 */
public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();
    public String verificarPosicao(NumeroDTO numeroDTO){
        return numeroDAO.verificarPosicao(numeroDTO);
    }
}
