/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz02;

/**
 *
 * @author leonardo-teixeira
 */
public class Matriz02CTR {

    Matriz02DAO numeroDAO = new Matriz02DAO();

    public String mostrarMatriz(Matriz02DTO numeroDTO) {
        return numeroDAO.mostrarMatriz(numeroDTO);
    }
}
