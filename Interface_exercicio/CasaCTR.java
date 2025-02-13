/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_exercicio;

/**
 *
 * @author leonardo-teixeira
 */
public class CasaCTR {
    CasaDAO casaDAO = new CasaDAO();
    
    public String publicarDados(CasaDTO casaDTO){
        return casaDAO.publicarDados(casaDTO);
    }
    
}
