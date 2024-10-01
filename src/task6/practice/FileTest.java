package task6.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
  public static void main(String[] args) {
    try {
      File file = new File("D://test//textFile1.txt");
      if (file.createNewFile()) {
        System.out.println("File is created!");
      } else {
        System.out.println("File already exists.");
      }

      FileWriter fileWriter = new FileWriter(file);
      fileWriter.write("Test Data");
      fileWriter.close();

      FileReader fileReader = new FileReader(file);
      int i;
      while ((i = fileReader.read()) != -1) {
        if ((char) i == ' ') {
          System.out.print(" ");
          continue;
        }
        System.out.print((char) i);
      }
      fileReader.close();
    } catch (IOException e) {
      System.out.println("Exception");
    }
  }
}

/*
 * Kode di atas merupakan implementasi penanganan error dengan eksepsi
 * yang kurang tepat, karena pesan yang dikirim tidak spesifik menjelaskan error
 * yang seperti apa.
 */
