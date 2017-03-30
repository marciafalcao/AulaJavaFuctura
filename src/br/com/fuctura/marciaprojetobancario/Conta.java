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

public class Conta {
  //criar os atributos
         private int atrnumero;
         private double atrsaldo;
         
        
   //criar o Construtor Conta
     public Conta(int numero1, double saldo1) {
         atrnumero = numero1;
         atrsaldo = saldo1;
}    
         
    //criar os metodos - comportamento
    //    retorno    nome   (parametros)
    //    Metodo xxxx
    //        o retorno é boolean, para dizer q fez ou nao fez
    //
    // Metodo abaterValor
    boolean abaterValor(double valor, double valor2){  
      boolean teste = false;  
      if (valor <= this.atrsaldo){
            this.atrsaldo = (this.atrsaldo - valor);
                teste = true;
            }
      else {
           if (valor2 <= this.atrsaldo){
                this.atrsaldo = (this.atrsaldo - valor2);
                teste = true;
            }
      }
      return teste;
    }
    
    // Metodo sacar simples
    void sacar(double valor, double valor2){
     
       if (abaterValor(valor, valor2)){
             System.out.println("   Saque de realizado.");
       }
           
    }
    
    // Metodo sacar a tarifa
    void sacar(double tarifa){
        this.atrsaldo = (this.atrsaldo - tarifa);
    }
    
     // Metodo transferir
    void transferir(double valor, double valor2){
        abaterValor(valor,valor2);
    }
    
     // Metodo consultarSaldo
    double consultarSaldo(){
      return atrsaldo;
    }
    
    
    //     Metodo depositar um valor
    void depositar (double valor){
        this.atrsaldo = this.atrsaldo + valor;
       
    }
    
        //     Metodo exibe saldo
    void exibirSaldo (){
        System.out.println(" ");
        System.out.println("      Novo saldo : " + consultarSaldo());
        
    }

    
   // get 
    public int getAtrnumero() {
        return atrnumero;
    }

    public double getAtrsaldo() {
        return atrsaldo;
    }

    

    
   // set 
    public void setAtrnumero(int atrnumero) {
        this.atrnumero = atrnumero;
    }

    public void setAtrsaldo(double atrsaldo) {
        this.atrsaldo = atrsaldo;
    }

   
    
    
}
