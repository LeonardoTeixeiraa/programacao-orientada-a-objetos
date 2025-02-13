
package Ex1_Cliente;

/**
 *
 * @author leonardo-teixeira
 */
public class ClienteDAO {
    private String mensagem = "";
    
    public String mostraRg(ClienteDTO clienteDTO){
        this.mensagem =  "O RG é: " + clienteDTO.getRg() +
        "\nO Nome é: " + clienteDTO.getNome();
        
        return this.mensagem;
    }
}
