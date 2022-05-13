/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

/**
 *
 * @author v3gc
 */
public class Computador extends Produto implements Autenticacao{
    
    @Override
    public double calcularPreco(double valorCompra, double valorLucro){
        double precoDeVenda = valorCompra + valorLucro;
        return precoDeVenda;
    }

    @Override
    public boolean autenticaCodigo(long codigo) {
        return (codigo == codigoDeBarras);
    }

    
}
