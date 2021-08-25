
package classe3;

import clases.cliente;

public class Classe3 {

   
    public static void main(String[] args) {
        cliente cli=new cliente();
        cli.setRut("12365854-k");
        cli.setNombre("juanito");
        cli.setApellido("simio");
        cli.setEdad(6);
        System.out.println("Los datos del cliente son;"+cli.toString());
        
        
        
    }
    
 }
