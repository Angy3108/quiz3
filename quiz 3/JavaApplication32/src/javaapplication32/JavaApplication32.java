/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication32;

import javax.swing.JOptionPane;

/**
 *
 * @author angeg
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Numerales[][] = new int[100][4];
        String texto[][] = new String[100][2];
        boolean ciclo = true;
        int menu = 0;
        Participante corredor1 = new Participante();
        int edad=0;

        for (int i = 0; i < 100; i++) {
            JOptionPane.showMessageDialog(null, "va por la vuelta " + i);
            ciclo=true;
            for (int j = 0; j < 3; j++) {
             
                while (ciclo) {

                    menu = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido\n 1.Nombre \n2.Edad \n 3. Numero de corredor\n 4.Tiempo estimado\n 5. Desea añadir otro participante? \n 6.salir"));

                    switch (menu) {
                        case 1:

                            texto[i][j] = JOptionPane.showInputDialog("Ingrese el nombre del participante");
                            j=1;

                            break;
                        case 2:
                            j=0;
                            
                                    edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del participante"));
                                    Numerales[i][j] =edad;
                            j=1;
                            break;
                        case 3:
                            
                            Numerales[i][j] = i;
                            JOptionPane.showMessageDialog(null, "El numero de corredor es: "+i);
                            j=2;
                            break;
                           
                        case 4:
                            
                            Numerales[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo estimado del participante"));
           
                            break;
                        case 5:
                            ciclo = false;
                            break;
                        case 6:
                            i = 100;
                            JOptionPane.showMessageDialog(null, "ha terminado con sus asignaciones");
                            ciclo=false;
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Ingreso una opcion incorrecta");
                            break;
                    }
                }
                
                
                Participante.tiempoFinal();
                
                
                
            }
        }
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println( "el nombre del participante es:" +texto[i][j]);
                System.out.println("la edad del participante es:"+Numerales[i][j]);
                 
            }
        }

    }
}
    


