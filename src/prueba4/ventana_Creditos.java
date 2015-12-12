/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4;

import javax.swing.JFrame;

/**
 *
 * @author Administrador
 */
public class ventana_Creditos extends JFrame{
     public ventana_Creditos(){
        this.setTitle("Creditos");
        this.setSize(700,600);
       
         Panel_Creditos c2=new Panel_Creditos();
        this.add(c2);
    }
}