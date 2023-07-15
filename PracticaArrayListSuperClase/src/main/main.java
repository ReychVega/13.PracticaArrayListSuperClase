package main;

import domain.claseHija;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author reych
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<claseHija> lista=new ArrayList<>();
        lista.add(new claseHija("jj",5));
        System.out.println(lista.size());
      String s="gg/gg";
        System.out.println(s.split("/").length);
      

    }
    
    public static void insertarDatos(ArrayList<claseHija> list){
        String name;
        int edad;
        for (int i = 0; i < list.size(); i++) {
             name=JOptionPane.showInputDialog("Insert your name:");
             edad =Integer.parseInt(JOptionPane.showInputDialog("Insert your name:"));            
             list.add(new claseHija(name,edad));
        }
    }
    
    public static void showData(ArrayList<claseHija> list){
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, list.get(i));
        }
    
    }
    
}
