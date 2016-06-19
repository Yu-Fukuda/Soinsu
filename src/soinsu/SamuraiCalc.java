package soinsu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
* 文字列を \n ごとに分けて素因数分解する
* @author YuFukuda
*/
class SamuraiCalc {
    void inputSplitter() throws IOException {
        String _inputedText = inputter.inputText();
        //改行コード\nで区切れなかったので、数値以外を改行として改行タグとして扱う
        _inputedText = _inputedText.replaceAll("[^0-9]", "<BR>");
        //System.out.println(_inputText);
        String[] sakeruCheese = _inputedText.split("<BR><BR>");
	    
	    int i = 0 ;
	    int intInputedText = 0;
	    while ( i < sakeruCheese.length ){
	        intInputedText = Integer.parseInt(sakeruCheese[i]);
	      
	      try {
	          String filePath = "./SoinsuKekka.csv";
              FileWriter fileOkiba = new FileWriter(filePath, true);
              PrintWriter printWriter 
                      = new PrintWriter(new BufferedWriter(fileOkiba));
              
              printWriter.print(intInputedText +",");
              System.out.print(intInputedText +",");
              
              int waruKazu = 2; 
              while (waruKazu < intInputedText) {
                  if (intInputedText % waruKazu == 0){
                      intInputedText = intInputedText / waruKazu; //割りきれた数が再度割り切れる可能性がある
                      printWriter.print(waruKazu + ",");
                      System.out.print(waruKazu + ",");
                	  waruKazu = 2; //割り切れたら毎回初期化する
                  } else {
                	  waruKazu ++;
                  }
              }
              
              printWriter.print(waruKazu+ "\n");
              System.out.print(waruKazu + "\n");
              printWriter.close();
              
          } catch (IOException ex){
              System.out.print("不正な値が入力されました:" + _inputedText);
              ex.printStackTrace();
          }
	      i++;
	    }
	}
}