/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_exercicio;

/**
 *
 * @author leonardo-teixeira
 */
public class CasaDAO implements ICasaDAO{
    private String mensagem;
    
    public String publicarDados(CasaDTO casaDTO){
        this.mensagem =  "O endereço é: " + casaDTO.getEndereco() +
                                        "\n O numero e: " + casaDTO.getNumero() + 
                                         "\n O bairro e: " + casaDTO.getBairro() +
                                         "\nA cidade é:  " + casaDTO.getCidade() +
                                         "\nO Proprietário é:  " + casaDTO.getProprietario();
                return mensagem;
    }
    
}
