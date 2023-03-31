
package LibrosServicios;

import entidades.Libros;
import java.util.Scanner;


public class Servicios {
    Scanner leer = new Scanner(System.in);
   public Libros altas () {
   Libros l1 = new Libros();{
   
       System.out.println("Ingrese el ISBN");
    l1.setISBN(leer.next());
       System.out.println("Ingrese el autor del libro");
    l1.setAutor(leer.next());
       System.out.println("Ingrese el Titulo del Libro ");
       l1.setTitulo(leer.next());
       System.out.println("Ingrese el nuemro de paginas ");
       l1.setNumeroDePaginas(leer.nextInt());
       
       return l1;
}
    
    
    
}
}