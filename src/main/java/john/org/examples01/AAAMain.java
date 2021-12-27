/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.org.examples01;

import john.org.examples01.file_nio_stuff.AAA_MyNio_examples;

/**
 *
 * @author john
 */
public class AAAMain {

    public AAAMain() {
        System.out.print("Class ::: "+this.getClass().getName()+" ");
        System.out.println("Hi From Examples ");
        new AAA_MyNio_examples();
    }
    
    public static void main(String[] args) {
        new AAAMain();
    }
}
