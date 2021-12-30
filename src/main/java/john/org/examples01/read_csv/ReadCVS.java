/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.org.examples01.read_csv;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author john
 */
public class ReadCVS {

    public ReadCVS() {
        System.out.println("This class will reatd a cvs file");

        String name = "student.csv";
        BufferedReader read = null;
        String line = "";
        try {
             read = new BufferedReader(new FileReader(name));
             while((line = read.readLine()) != null){
                 String[] row = line.split(",");
                 for(String index : row){
                     System.out.format("%s ",index);
                 }
                 System.out.println("");
             }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            read.close();
        }

    }

}
