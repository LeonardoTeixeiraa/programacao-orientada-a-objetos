/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaBanco;

/**
 *
 * @author leonardo-teixeira
 */
public class BancoCTR {

    BancoDAO bancoDAO = new BancoDAO();

    public String depositar(double valor) {
        return bancoDAO.depositar(valor);
    }

    public String sacar(double valor) {
        return bancoDAO.sacar(valor);
    }

    public String ConsultarSaldo() {
        return bancoDAO.ConsultarSaldo();
    }
}
