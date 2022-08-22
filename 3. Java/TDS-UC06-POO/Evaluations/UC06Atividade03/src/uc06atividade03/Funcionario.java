/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade03;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;
    private float salario;
    private String modalidadeDeContratacao;
    
    public Funcionario() {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
        this.salario = salario;//coloco o salário aqui e sobreescrevo ele nas subclasses OU crio ele direto nelas?
        this.modalidadeDeContratacao = modalidadeDeContratacao;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getModalidadeDeContratacao() {
        return modalidadeDeContratacao;
    }

    public void setModalidadeDeContratacao(String modalidadeDeContratacao) {
        this.modalidadeDeContratacao = modalidadeDeContratacao;
    }
    
    public void mostraDados() {
        System.out.println("***** Ficha de " + this.getNome() + ": *****");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Modalidade de contratação: " + this.getModalidadeDeContratacao());
    }
    
    public void calculaSalario() {
        this.salario = this.getSalario();
    }
    
    public void aplicaAumento() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a porcentagem de aumento recebido: ");
        float porcentagemDeAumento = entrada.nextFloat();
        float aumento = (porcentagemDeAumento/100) * this.getSalario();
        entrada.nextLine();
        
        this.setSalario(this.getSalario() + aumento);
        
    }
    
    public boolean ehCeletista() {
        return setor.equals("celetista");
    }
}
