/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salarioFuncionario;

/**
 *
 * @author leonardo-teixeira
 */
public class salarioDAO {

    salarioDTO salDTO = new salarioDTO();

    public double CalcularSalario(salarioDTO salDTO) {
        double horasTr =  (salDTO.getSalarioMinimo()/8); // Valor da hora trabalhada
        double horasEx = salDTO.getHorasExtras() * (salDTO.getSalarioMinimo()/4); //valor da hora extra
        double salMin = salDTO.getSalarioMinimo(); //Valor salario Minimo
        double salBruto = salDTO.getHorasTrabalhadas()* horasTr; //Valor do salario Bruto
        double salFim = salBruto + horasEx; // valor do salario final.
        
        return salFim;
    }
    
    public String mostraSalario(salarioDTO salarioDTO){
        return  "Salario a receber:  R$ " + CalcularSalario(salDTO);
    }

}
//Levando em consideração a necessidade de se desenvolver um sistema que calcule e mostre o salário a receber de um 
//funcionário com base nas informações de número de horas trabalhadas, 
//valor do salário mínimo e o número de horas extras trabalhadas pelo funcionário. 
//
//As regras para se calcular o salário a receber são:
//
//    A hora trabalhada vale 1/8 do salário mínimo;
//    A hora extra vale ¼ do salário mínimo;
//    O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//     quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo valor da hora extra;
//    O salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras.
//
//A sua equipe possui 4 pessoas e você ficou responsável por desenvolver a classe DAO desse sistema.
//
//Desenvolva a classe, copie e cole o código dentro do local indicado na questão.
