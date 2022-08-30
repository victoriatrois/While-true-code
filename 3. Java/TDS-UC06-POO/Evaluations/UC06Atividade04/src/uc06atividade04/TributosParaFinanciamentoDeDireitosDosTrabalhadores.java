/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade04;

/**
 *
 * @author v3gc
 */
public abstract class TributosParaFinanciamentoDeDireitosDosTrabalhadores extends Tributo{
    private float debitoTotalDaEmpresa;
    private float creditoTotalDaEmpresa;
    private float resultadoCalculo;

    public float getDebitoTotalDaEmpresa() {
        return debitoTotalDaEmpresa;
    }

    public void setDebitoTotalDaEmpresa(float debitoTotalDaEmpresa) {
        this.debitoTotalDaEmpresa = debitoTotalDaEmpresa;
    }

    public float getCreditoTotalDaEmpresa() {
        return creditoTotalDaEmpresa;
    }

    public void setCreditoTotalDaEmpresa(float creditoTotalDaEmpresa) {
        this.creditoTotalDaEmpresa = creditoTotalDaEmpresa;
    }
    
    public float getResultadoCalculo() {
        return resultadoCalculo;
    }

    public void setResultadoCalculo(float resultadoCalculo) {
        this.resultadoCalculo = resultadoCalculo;
        
    }
    
    @Override
    public float calculaImposto(){
        float diferencaEntreDebitoECredito = this.getDebitoTotalDaEmpresa() - this.getCreditoTotalDaEmpresa();
        this.setResultadoCalculo((diferencaEntreDebitoECredito / 100) * this.getAliquota());
        
        return this.getResultadoCalculo();
    }
    
    @Override
    public String toString() {
        return this.getSigla() + "\n" + this.getDescricao() + "\naliquota: " + this.getAliquota() + "%\n"
                + "O tributo totaliza: : " + this.getResultadoCalculo() +".";
    } 
    
}
