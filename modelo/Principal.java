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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Conta c1 = new Conta();
        Endereco e1 = new Endereco();
        
        Pessoa p2 = new Pessoa();
        Conta c2 = new Conta();
        
        p1.setNome("Marlon");
        p1.setSobrenome("Rodler");
        p1.setCPF("12345678912");
        
        p2.setNome("Sara");
        p2.setSobrenome("Laviso");
        p2.setCPF("12345678921");
        
        c1.setNumero(1);
        c1.setSaldo(5000.00);
        c1.setLimite(500.00);
        
        c2.setNumero(2);
        c2.setSaldo(2000.00);
        c2.setLimite(400.00);
        
        e1.setRua("R. Prefeito Luiz Piza Sobrinho");
        e1.setNumero("335");
        e1.setCidade("Pirajuí");
        e1.setEstado("SP");
        e1.setCEP("16604-020");
        
        p1.setConta(c1);
        p1.setReside(e1);
        
        p2.setConta(c2);
        p2.setReside(e1);
        
        c1.setDono(p1);
        c2.setDono(p2);
        
        e1.setMoradores(p1);
        e1.setMoradores(p2);
        
        System.out.println("Sacar");
        c1.sacar(500);
        System.out.println("Conta 1: "+c1.getSaldo());
        c2.sacar(400);
        System.out.println("Conta 2: "+c2.getSaldo());
        
        System.out.println("\nDepositar");
        c1.depositar(500);
        System.out.println("Conta 1: "+c1.getSaldo());
        c2.depositar(400);
        System.out.println("Conta 2: "+c2.getSaldo());
        
        System.out.println("\nTransferir Conta 1 para Conta 2");
        c1.transferir(c1, 500, c2);
        System.out.println("Conta 1: "+c1.getSaldo());
        System.out.println("Conta 2: "+c2.getSaldo());
        
        System.out.println("\nTransferir Conta 2 para Conta 1");
        c1.transferir(c2, 100, c1);
        System.out.println("Conta 1: "+c1.getSaldo());
        System.out.println("Conta 2: "+c2.getSaldo());
        
        System.out.println("\nValidar CPF");
        p1.validarCPF();
        p2.validarCPF();
        
        System.out.println("\nNome Completo");
        p1.getNomeCompleto();
        p2.getNomeCompleto();
        
        System.out.println("\nLocalizar CEP");
        e1.getLocalizacaoByCEP("16604-020");
    }
    
}
