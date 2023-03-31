
package ejercicio1;

import LibrosServicios.Servicios;
import entidades.Libros;


public class Ejercicio1 {

    
    public static void main(String[] args) {
            Servicios ls = new Servicios(); 
            Libros l1 = ls.altas();
            System.out.println("la informacion del libro es :  "+ l1.toString());
            
    }
      
    }
    

