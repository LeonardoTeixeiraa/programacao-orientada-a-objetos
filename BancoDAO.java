/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaBanco;

/**
 *
 * @author leonardo-teixeira
 */
public class BancoDAO {

    private String mensagem = "";
    BancoDTO bancoDTO = new BancoDTO();

    public String depositar(double valor) {
        if(valor > 0){
            bancoDTO.setSaldo(bancoDTO.getSaldo() + valor);
            this.mensagem = "Depósito no valor de R$ " + valor +  " realizado com sucesso!";
        }
        else{
            this.mensagem = "Valor de depósito inválido!";
        }
        return this.mensagem;
        
    }

    public String sacar(double valor) {
        if (bancoDTO.getSaldo() < valor) {
            return this.mensagem = "Saldo insulficiente";
        }
        bancoDTO.setSaldo(bancoDTO.getSaldo() - valor);
        return this.mensagem = "Valor sacado: " + valor;
    }

    public String ConsultarSaldo() {
        return this.mensagem = "O seu saldo é: " + bancoDTO.getSaldo();
        }
}
    
