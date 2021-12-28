/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.org.examples01;

/**
 *
 * @author john
 */
public class ClassInfo {

    String s;
    Object t;

    
    public ClassInfo() {

    }

    public ClassInfo(Object t) {
        this.t = t;
        showClass(t);
        
    }

    private void showClass(Object t1) {
        System.out.println("" + t1.getClass().getCanonicalName());
    }

}
