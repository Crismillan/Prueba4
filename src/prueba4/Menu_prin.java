
package prueba4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu_prin extends JFrame {
    
    JMenuBar barra=new JMenuBar();
    JMenu mnuArchivo=new JMenu("Archivo");
    JMenu mnuModulos=new JMenu("Modulos");
    JMenu mnuCreditos=new JMenu("Creditos"); 
    
    JMenuItem mnuSalir=new JMenuItem("Salir");
    JMenuItem mnuUsuarios=new JMenuItem("Usuarios");
    JMenuItem mnuMascotas=new JMenuItem("Mascotas");
    JMenuItem mnuRazas=new JMenuItem("Razas");
    JMenuItem mnuCreditos2=new JMenuItem("creditos");
    
    Ventana_Usuarios vU=new Ventana_Usuarios();
    Ventana_Mascota vMS=new Ventana_Mascota();
    Ventana_Raza vRZ= new Ventana_Raza();
    ventana_Creditos vCS= new ventana_Creditos();
    
    public Menu_prin(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cuartel de Operaciones xD");
        this.setSize(700, 700);
        this.setVisible(true);
      
        barra.add(mnuArchivo);
        barra.add(mnuModulos);
        barra.add(mnuCreditos);
        mnuModulos.add(mnuUsuarios);
        mnuModulos.add(mnuMascotas);
        mnuModulos.add(mnuRazas);
        
        mnuCreditos.add(mnuCreditos2);
        mnuArchivo.add(mnuSalir);
        
        this.add(barra,BorderLayout.NORTH);
        OyenteModulo1 o1=new OyenteModulo1();
        mnuUsuarios.addActionListener(o1);
        OyenteModulo2 o2=new OyenteModulo2();
        mnuMascotas.addActionListener(o2);
        OyenteModulo3 o3=new OyenteModulo3();
        mnuRazas.addActionListener(o3);
        OyenteModulo4 o4=new OyenteModulo4();
        mnuCreditos2.addActionListener(o4);
        
        OyenteCerrar oCerrar=new OyenteCerrar();
        mnuSalir.addActionListener(oCerrar);
    }
    class OyenteModulo1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         vU.setVisible(true);
        }
    }
    class OyenteModulo2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         vMS.setVisible(true);
        }
    }
    class OyenteModulo3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         vRZ.setVisible(true);
        }
    }
    
    class OyenteModulo4 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         vCS.setVisible(true);
        }
    }
    
    
    class OyenteCerrar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    
}
