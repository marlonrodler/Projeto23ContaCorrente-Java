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
public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String CEP;
    private ArrayList<Pessoa> moradores;

    public Endereco() {
        this.moradores = new ArrayList<>();
    }

    public Endereco(String rua, String numero, String cidade, String estado, String CEP, ArrayList<Pessoa> moradores) {
        this.moradores = new ArrayList<>();
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
        this.moradores = moradores;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void getMoradores() {
        for (int j = 0; j < moradores.size(); j++) {
            System.out.println(this.moradores.get(j).getNome());
        }
    }

    public void setMoradores(Pessoa mora) {
        this.moradores.add(mora);
    }

    
    
    
    
    public void getLocalizacaoByCEP(String CEP){
        if(CEP == this.CEP){
            for (int j = 0; j < moradores.size(); j++) {
                System.out.println(this.moradores.get(j).getNome());
            }
        }
    }
}
