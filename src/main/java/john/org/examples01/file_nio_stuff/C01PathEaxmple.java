/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.org.examples01.file_nio_stuff;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 *
 * @author john
 */
public class C01PathEaxmple {

    public C01PathEaxmple() {
//        System.out.println("Class ::: " + this.getClass().getName());
        System.out.println("");
        Path p = Paths.get("/home/john/aaa/junk/my.txt");

//        gettint_The_Root_and_Parrent(p);
        getting_The_Parrent_Directory(p);
        getting_The_Root_Directory(p);
        getting_The_File_Name(p);
//        information(p);
        using_An_Itterator(p);
    }

    private void information(Path p) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println("### Function ::" + name);

        System.out.format("toString:        %s%n", p.toString());
        System.out.format("getName(2):      %s%n", p.getName(0));
        System.out.format("subpath(1,3):    %s%n", p.subpath(1, 3));
        System.out.format("getNameCount:    %d%n", p.getNameCount());
        System.out.println("");
    }

    private void getting_The_Root_Directory(Path p) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.format("### Function ::  %s###%n", name);
        System.out.format("File             %s%n", p);
        System.out.format("getRoot:         %s%n", p.getRoot());
        System.out.println("");
    }

    private void getting_The_Parrent_Directory(Path p) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.format("### Function ::  %s###%n", name);
        System.out.format("File             %s%n", p);
        System.out.format("getParent:       %s%n", p.getParent());
        System.out.println("");
    }

    private void getting_The_File_Name(Path p) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.format("### Function  :: %s ###%n", name);
        System.out.format("File:            %s%n", p);
        System.out.format("getFileName:     %s%n", p.getFileName());
        System.out.println("");
    }

    private void using_An_Itterator(Path p) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.format("### Function :: %s###%n",name);
        System.out.format("name:           %s%n", p.toString());
        
        System.out.print("Itorator     ");
        int i = 0;
        for (Iterator iterator = p.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.print("  " + i++ + ")" + next);
        }
        System.out.println("\n");
    }

}
