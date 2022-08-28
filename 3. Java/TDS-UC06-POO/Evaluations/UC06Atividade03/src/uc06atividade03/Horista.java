/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade03;

/**
 *
 * @author v3gc
 */
public class Horista extends Funcionario {
    private float valorHora;
    private float horasTrabalhadas;
    //devo criar um novo atributo salario sendo que ele já existe na superclasse?
    
    @Override
    public void calculaSalario() {
        this.setSalario(this.getValorHora() * this.getHorasTrabalhadas());
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    
}
