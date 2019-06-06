/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * @author aluno
 */
public class Parque {
    public static int main(String[] args){
     Gato cat=new Gato("j");
      cat.name="Bola";
      cat.miar();
     Gato gatinho=new Gato("duin");
     gatinho.idade=2;
     gatinho.macho=true;
     gatinho.miar();
     cat.registro=gatinho;
     return 0;
}
}
     
             
              
             
}
