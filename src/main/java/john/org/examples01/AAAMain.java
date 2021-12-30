/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.org.examples01;

import john.org.examples01.file_nio_stuff.AAA_MyNio_examples;
import john.org.examples01.read_csv.ReadCVS;

/**
 *
 * @author john
 */
public class AAAMain {

    public AAAMain() {
//        System.out.print("Class ::: "+this.getClass().getName()+" ");
//        System.out.println("Hi From Examples ");
        ClassInfo c = new ClassInfo(this);
//        System.out.println(c);
        
//        new AAA_MyNio_examples();
        new ReadCVS();
    }
    
    public static void main(String[] args) {
        new AAAMain();
    }
}
