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
    
    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor, float salario, String modalidadeDeContratacao) {
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

    @Override
    public String toString() {
        return "***** Ficha de " + this.getNome() + ": *****\n" + "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nEndereco:" + this.getEndereco() + "\nTelefone:" + this.getTelefone() + "\nSetor: " + this.getSetor() + "\nSalario:" + String.format("%.2f", this.getSalario()) + "\nModalidade de contratação: " + this.getModalidadeDeContratacao();
    }
    
    
    public void calculaSalario() {
        this.salario = this.getSalario();
    }
    
    public void aplicaAumento() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a porcentagem de aumento recebido: ");
        float porcentagemDeAumento = entrada.nextFloat();
        entrada.nextLine();
        
        float aumento = (porcentagemDeAumento/100) * this.getSalario();
        
        
        this.setSalario(this.getSalario() + aumento);
        
    }
    
    public boolean ehCeletista() {
        return setor.equals("celetista");
    }
    
    
}
