/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.org.examples01.read_csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author john
 */
public class ReadCVS {

    public ReadCVS() {
        try {
            System.out.println("This class will reatd a cvs file");
            
            Path path = Paths.get("student.csv");
            
            
            BufferedReader reader = Files.newBufferedReader(path);
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException ex) {
            Logger.getLogger(ReadCVS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
