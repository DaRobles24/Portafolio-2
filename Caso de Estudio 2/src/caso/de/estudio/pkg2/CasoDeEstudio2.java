/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.de.estudio.pkg2;

/**
 *
 * @author danie
 */
public class CasoDeEstudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creamos la clase Cancion
        Cancion cancion1 = new Cancion (568,"M.A.I", "Milo J", 3.04, 2023);
              
        // Usar los getters
        System.out.println("ID de la cancion: " + cancion1.getId());
        System.out.println("Titulo de la cancion: " + cancion1.getTitulo());
        System.out.println("Autor de la cancion: " + cancion1.getAutor());
        System.out.println("Duracion de la cancion: " + cancion1.getDuracion() + " minutos");
        System.out.println("Fecha de creacion de la cancion: " + cancion1.getAñoCreacion());

        // Usar los setters
        cancion1.setTitulo("M.A.I");
        cancion1.setAutor("Milo J");
        cancion1.setDuracion(3.04);
        cancion1.setAñoCreacion(2023);

        // Mostramos los cambios realizados
        System.out.println("\nDespues de usar los setters:");
        System.out.println("Titulo de la cancion: " + cancion1.getTitulo());
        System.out.println("Autor de la cancion: " + cancion1.getAutor());
        System.out.println("Duracion de la cancion: " + cancion1.getDuracion() + " minutos");
        System.out.println("Fecha de la cancion: " + cancion1.getAñoCreacion());
    }
    
}
