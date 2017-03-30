/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.marciaprojetobancario;

/**
 *
 * @author Fuctura-Marcia
 */
//IMPORTS
import java.util.Scanner;

public class AgenciaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        //criando um objeto da classe Conta
          ContaCorrente objcontaa = new ContaCorrente(555, 2000, 100000);
          ContaPoupanca objcontab = new ContaPoupanca(777, 4000);
        
        //Usando os métodos set
        
               
        // EXIBIR NA TELA
        System.out.println("===>  Seguem informações de sua conta: ");
        System.out.println(" ");
        System.out.println("      Conta :   " + objcontaa.getAtrnumero());
        System.out.println("      Limite: R$" + objcontaa.getAtrlimite());
        System.out.println("      Saldo : R$" + objcontaa.getAtrsaldo());
        
        // Chamar o metodo sacar simples
        objcontaa.sacar(50.00, 10.00);
        
        // Chamar o metodo sacar tarifa
        objcontaa.sacar(3.00);
        objcontaa.exibirSaldo();
        
        // Transferir da conta1 para conta2 até zerar o saldo, usando while
        
        
        
    }
    
}
