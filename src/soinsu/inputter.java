package soinsu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
* txtファイルを読み込む
* @author YuFukuda
*/
public class inputter {
    public static String inputText() throws IOException{

        String filePath = "./SoinsuNyuryoku.txt";
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input = bufferedReader.readLine();

        System.out.println("素因数分解出力します！テキストファイルを読みこみます\n"
                + "SoinsuNyuryoku.txt :" + input);
        
        fileReader.close();
        return input;
        
    }
}
