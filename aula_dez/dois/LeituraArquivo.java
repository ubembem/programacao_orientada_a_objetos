import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;


public class LeituraArquivo {

   public static void ler(String caminho){

       try {

           FileReader fileReader = new FileReader(caminho);

           BufferedReader br = new BufferedReader(fileReader);

           String texto = br.readLine();

           System.out.println(texto);

           br.close();

       } catch (FileNotFoundException e) {

           e.printStackTrace();

       } catch (IOException e) {

           e.printStackTrace();

       }

   }

}//class
