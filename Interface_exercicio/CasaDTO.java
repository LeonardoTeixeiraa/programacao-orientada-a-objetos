/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_exercicio;

/**
 *
 * @author leonardo-teixeira
 */
public class CasaDTO extends  ImovelDTO implements ICasaDTO{
    private int n_quartos, n_banheiros;

    public int getN_quartos() {
        return n_quartos;
    }

    public void setN_quartos(int n_quartos) {
        this.n_quartos = n_quartos;
    }

    public int getN_banheiros() {
        return n_banheiros;
    }

    public void setN_banheiros(int n_banheiros) {
        this.n_banheiros = n_banheiros;
    }
    
}
