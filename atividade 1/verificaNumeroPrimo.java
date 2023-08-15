package primos;

import java.until.Scanner;

public class numeroprimo {
  public static void main(string[] args){
    
    scanner leitor = new scanner(sustem.in);
    int numprimo;
    int numdivi = 0;
    
    system.out.println("digite um numero");
    numprimo = leitor.nextint();
    
    for(int i = 1; i <= numprimo; i++){
      if(numprimo % i == 0){
        numdivi++;
      }
    }
    if(numdivi == 2){
      system.out.println("1");
    }esle {
      system.out.println("0");
    }
  }
}
