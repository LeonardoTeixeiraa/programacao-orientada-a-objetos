/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1_Cliente;

/**
 *
 * @author leonardo-teixeira
 */
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String mostraRg(ClienteDTO clienteDTO){
        return clienteDAO.mostraRg(clienteDTO);
    }
}
