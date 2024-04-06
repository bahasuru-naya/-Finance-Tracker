/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.assignment;

/**
 *
 * @author LENOVO
 */
public class UserThread extends Thread {
    public void run()
    {
         synchronized (this){
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               //generate report
            }
        });
         }
    }
}
