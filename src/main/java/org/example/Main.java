package org.example;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        String data="Bu hem tamponlanır hemde diğer tüm özellikleri içeirisinde barındırır" +
                "\nve bu sayede daha kolay işlemler yapabilir en çok bu yöntem kullanılır" +
                "\ndosya yazma işlemlerinde.";
        try {
            FileWriter fileWriter=new FileWriter("metin.txt", Charset.forName("UTF-8"),true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Veriler dosyaya başarılır bir şekilde yazıldı.");
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            FileReader fileReader=new FileReader("metin.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            int c;
            while ((c=bufferedReader.read())!=-1){
                System.out.print((char) c);
            }
            bufferedReader.close();
            fileReader.close();
            System.out.println("\nDosya başarılı bir şekilde okundu.");
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}