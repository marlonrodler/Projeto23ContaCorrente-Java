/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String CPF;
    private ArrayList<Conta> contas;
    private Endereco reside;

    public Pessoa() {
        this.contas = new ArrayList<>();
    }

    public Pessoa(String nome, String sobrenome, String CPF, ArrayList<Conta> conta, Endereco reside) {
        this.contas = new ArrayList<>();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.contas = conta;
        this.reside = reside;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void getConta() {
        for (int j = 0; j < contas.size(); j++) {
            System.out.println(this.contas.get(j).getNumero());
        }
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }

    public Endereco getReside() {
        return reside;
    }

    public void setReside(Endereco reside) {
        this.reside = reside;
    }
    
    
    
    
    public void validarCPF(){
        if(this.CPF.length() == 11){
            System.out.println("CPF Válido!");
        }else{
            System.out.println("CPF Inválido!");
        }
    }
    
    public void getNomeCompleto(){
        System.out.println(""+this.nome+" "+this.sobrenome);
    }
}
