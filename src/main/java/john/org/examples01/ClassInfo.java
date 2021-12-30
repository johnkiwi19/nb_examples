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
    boolean show;

    public ClassInfo() {

    }

    public ClassInfo(Object t) {
        this.t = t;
        this.show = true;
        showClass(t);

    }

    private void showClass(Object t1) {
        if (show) {
            System.out.println("Class    :: " + t1.getClass().getCanonicalName());
        }
    }

    public void on() {
        show = true;
    }

    public void off() {
        show = false;
    }

    @Override
    public String toString() {
        return "ClassInfo{" + "s=" + s + ", t=" + t + ", show=" + show + '}';
    }
    
    
}
