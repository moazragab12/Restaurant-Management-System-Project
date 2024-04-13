/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpart1;

/**
 *
 * @author dell
 */
public class Projectpart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Receptionist  s1 = new Receptionist ();
     
      System.out.println(s1.getID());
      s1.reserve(1);
        s1.reserve(5);
         s1.change_status(1);
         s1.reserve(5);
    }
    
}
