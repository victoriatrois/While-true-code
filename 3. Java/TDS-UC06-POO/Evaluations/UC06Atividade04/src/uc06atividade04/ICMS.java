/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade04;

/**
 *
 * @author v3gc
 */
public class ICMS extends Tributo {
    private float valorDaMercadoria;
    private float resultadoCalculo;

    public float getValorDaMercadoria() {
        return valorDaMercadoria;
    }
    
    public ICMS() {
        this.setSigla("ICMS");
        this.setDescricao("Imposto sobre Circulação de Mercadorias e Serviços");
        this.setAliquota(15);
    }

    public void setValorDaMercadoria(float valorDaMercadoria) {
        this.valorDaMercadoria = valorDaMercadoria;
    }

    public float getResultadoCalculo() {
        return resultadoCalculo;
    }

    public void setResultadoCalculo(float resultadoCalculo) {
        this.resultadoCalculo = resultadoCalculo;
        
    }
    
    @Override
    public float calculaImposto() {
        resultadoCalculo = ((this.getValorDaMercadoria() / 100) * this.getAliquota());
        return this.getResultadoCalculo();
    }
    
    @Override
    public String toString() {
        return this.getSigla() + "\n" + this.getDescricao() + "\naliquota: " + this.getAliquota() + "%\n"
                + "O tributo totaliza: " + this.getResultadoCalculo() + ".";
    }

    
}
