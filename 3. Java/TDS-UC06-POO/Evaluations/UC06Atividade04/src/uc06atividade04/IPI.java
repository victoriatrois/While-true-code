/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade04;

/**
 *
 * @author v3gc
 */
public class IPI extends Tributo {
    private float valorDoProduto;
    private float frete;
    private float valorDoSeguro;
    private float outrasDespesas;
    private float baseDeCalculo;
    private float resultadoCalculo;
    
    public IPI() {
        this.setSigla("IPI");
        this.setDescricao("Imposto sobre Produtos Industrializados");
        this.setAliquota(5);
    }
    
    public float getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(float valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public float getValorDoSeguro() {
        return valorDoSeguro;
    }

    public void setValorDoSeguro(float valorDoSeguro) {
        this.valorDoSeguro = valorDoSeguro;
    }

    public float getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(float outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }
    
    public float getResultadoCalculo() {
        return resultadoCalculo;
    }

    public void setResultadoCalculo(float resultadoCalculo) {
        this.resultadoCalculo = resultadoCalculo;
        
    }
    
    public float getBaseDeCalculo() {
        return baseDeCalculo;
    }

    public void setBaseDeCalculo(float baseDeCalculo) {
        this.baseDeCalculo = baseDeCalculo;
    }

    @Override
    public float calculaImposto() {
        this.setBaseDeCalculo(this.getValorDoProduto() + this.getFrete() + this.getValorDoSeguro() + this.getOutrasDespesas());
        this.setResultadoCalculo((baseDeCalculo / 100 ) * this.getAliquota());
        
        return this.getResultadoCalculo();
        
    }
    
    @Override
    public String toString() {
        return this.getSigla() + "\n" + this.getDescricao() + "\naliquota: " + this.getAliquota() + "%\n"
                + "O tributo totaliza: " + this.getResultadoCalculo() +".";
    }
    
}
