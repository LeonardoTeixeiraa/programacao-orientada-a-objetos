/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_exercicio;
import javax.swing.JOptionPane;
/**
 *
 * @author leonardo-teixeira
 */
public class ImovelView {
    public static void main(String [] args){
        try{
            CasaDTO casaDTO = new CasaDTO();
            CasaCTR casaCTR = new CasaCTR();
            
            casaDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: ")));
            casaDTO.setBairro(JOptionPane.showInputDialog("Informe o bairro: "));
            casaDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
            casaDTO.setProprietario(JOptionPane.showInputDialog("Informe o proprietario: "));
            casaDTO.setN_quartos(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de quartos: ")));
            casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de banheiros: ")));
            
            JOptionPane.showMessageDialog(null, casaCTR.publicarDados(casaDTO));
            
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " +  e.getMessage());
        }
    }
}
