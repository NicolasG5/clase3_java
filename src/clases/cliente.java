
package clases;


public class cliente {
    // atributos
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    // (2) constructores

    public cliente() {
    // constructor sin parametros
    }
    

    public cliente(String rut, String nombre, String apellido, int edad) {
    // constructor con parametros    
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    // (3) metodos accesadores y mutadores (get y set)

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        // (4) metodo toSt 
        return "cliente{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
}
