package clasepersona;


public class ClasePersona {

    int edad = 0;
    String nombre = "";
    String estadoCivil = "";
    String genero = "";

    public ClasePersona(int edad, String nombre, String estadoCivil, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
    }
    
    public void mostrar() {
        System.out.println("El nombre de la persona es: "+nombre);
        System.out.println(nombre+" tiene una edad de: "+edad);
        System.out.println("mi nombre es "+nombre+" tengo una edad de "+edad+" soy "+estadoCivil+" y soy "+genero);
    }
    
    public void correr() {
        System.out.println("Y hoy "+nombre+" ha corrido mucho");
    }
    
        public static void main(String[] args) {
            ClasePersona ClasePersona1 = new ClasePersona(24, "Pablo", "Soltero", "Masculino");
            ClasePersona1.mostrar();
            ClasePersona1.correr();
    }
    
    
}
