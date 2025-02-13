/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface_exercicio;

/**
 *
 * @author leonardo-teixeira
 */
public interface IImovelDTO {
    public void setEndereco(String endereco);
    public void setNumero(int numero);
    public void setBairro( String bairro);
    public void setCidade(String cidade);
    public void setProprietario(String proprietario);
    public String getEndereco();
    public int getNumero();
    public String getBairro();
    public String getCidade();
    public String getProprietario();
}
