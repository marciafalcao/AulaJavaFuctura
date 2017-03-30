/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.marciaprojetobancario;

/**
 *
 * @author Fuctura-pc12
 */
public class ContaCorrente extends Conta {
    //criar os atributos
    private double atrlimite;
    
    //criar o Construtor ContaCorrente
    public ContaCorrente (int numero1, double saldo1, double limite1){
        super (numero1,saldo1);
    }
    
    // Metodos get e set
    
    public double getAtrlimite() {
        return atrlimite;
    }
    
     public void setAtrlimite(double atrlimite) {
        this.atrlimite = atrlimite;
    }
    
}
