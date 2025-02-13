/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1_Cliente;
import javax.swing.JOptionPane;
/**
 *
 * @author leonardo-teixeira
 */
public class ClienteView {
    public static void main(String[] args){
        ClienteDTO clienteDTO = new ClienteDTO();
        ClienteCTR clienteCTR = new ClienteCTR();
        
        clienteDTO.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
        clienteDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
        
        JOptionPane.showMessageDialog(null, clienteCTR.mostraRg(clienteDTO));
    }
}
