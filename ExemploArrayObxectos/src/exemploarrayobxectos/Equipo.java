
package exemploarrayobxectos;

import javax.swing.JOptionPane;

public class Equipo {
    Xogador[] xogadores = new Xogador[3];
    
    public void crearArray(){
       for(int i=0;i<xogadores.length;i++)
           xogadores[i]= new Xogador(pedirNome(),pedirDorsal());
           
        } 
    public void amosarArray(){
        for(Xogador xo:xogadores){
            System.out.println(xo);
    }
    }
    
    public String pedirNome(){
        return JOptionPane.showInputDialog("nome");
    }
    public int pedirDorsal(){
        return Integer.parseInt(JOptionPane.showInputDialog("dorsal "));
    }
}
