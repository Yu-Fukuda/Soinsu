package soinsu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SamuraiCalc {
	public static void main(String args[]){
	    String str = "2\n2006\n";
	    String[] sakeruCheese = str.split("\n", 0);
	    
	    int i = 0 ;
	    int inputed = 0;
	    while ( i < sakeruCheese.length ){
	      inputed = Integer.parseInt(sakeruCheese[i]);
	      
	      
	      
	      
	      try {
              FileWriter fileOkiba = new FileWriter("./Soinsu.csv", false);
              PrintWriter printWriter 
                      = new PrintWriter(new BufferedWriter(fileOkiba));
              
              int waruKazu = 2; 
              while (waruKazu < inputed) {
                  if (inputed % waruKazu == 0){
                      printWriter.print(waruKazu+ ",");
                      System.out.print(waruKazu + ",");
                      waruKazu ++;
                  } else {
                  waruKazu ++;
                  }
              }
              
              
              
              
              printWriter.close();
              
          } catch (IOException ex){
              ex.printStackTrace();
          }
	      i++;
	    }
	  }
}