/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaBanco;

import javax.swing.JOptionPane;
// Alt + Shift + F =  formatar texto automáticamente

/**
 *
 * @author leonardo-teixeira
 */
public class BancoView {

    public static void main(String[] args) {
        BancoCTR bancoCTR = new BancoCTR();
        int op;
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1-Depositar"
                    + "\n2-Sacar"
                    + "\n3-Consultar o saldo da conta"
                    + "\n4- SAIR"
                    + "\nInforme a operação que deseja realizar:"));

            switch (op) {
                case 1:
                     double valorDeposito = Double.parseDouble(
                            JOptionPane.showInputDialog("Informe o valor para depósito:"));
                    String mensagem = bancoCTR.depositar(valorDeposito);
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;

                case 2:
                   double valorSaque = Double.parseDouble(
                            JOptionPane.showInputDialog("Informe o valor para saque:"));
                   
                     mensagem = bancoCTR.sacar(valorSaque);
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;

                case 3:
                    mensagem = bancoCTR.ConsultarSaldo();
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                     JOptionPane.showMessageDialog(null,"Opção informada Inválida. Por favor, informe um dos números acima: ");
            }
        } while (op != 4);
    }
}
