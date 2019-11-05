/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Pessoa dono;

    public Conta() {
    }

    public Conta(int numero, double saldo, double limite, Pessoa dono) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.dono = dono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public double sacar(double valor){
        this.saldo -= valor;
        return this.saldo;
    }
    
    public double depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }
    
    public void transferir(Conta conta, double valor, Conta destino) {
            conta.sacar(valor);
            destino.depositar(valor);
	}
}
