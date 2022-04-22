package oopaula05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author v3gc
 */
public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //método construtor
    public ContaBanco(){
    this.setSaldo(0);
    this.setStatus(false);
    
    //métodos acessores
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }
    
    //métodos personalizados
    public void estadoAtual(){
        System.out.println("------------------------------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "cc"){
            this.setSaldo(50);
            } else if (tipo == "cp"){
            this.setSaldo(150);
            } else{
                this.setSaldo(0);
            }
    }
    
    public void fecharConta(boolean status){
        if (saldo > 0){
            System.out.println("ERRO! Conta com saldo positivo.");
        } else if (saldo < 0){
            System.out.println("ERRO! Conta em débito.");
        }else{
            this.setStatus(false);
        }
    }
    
    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
        }else{
            System.out.println("ERRO! Essa conta não existe.");
        }
    }
    
    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            } else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("ERRO! Essa conta não existe.");
        }
    }
    
    public void pagarMensalidade(){
        int valor;
        valor = tipo == "cc" ? 12 : 20;

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("ERRO! Essa conta não existe.");
        }
    }
    
}
