package com.mycompany.vehiculo;

public class Vehiculo {
    String nombre;
    String empresa_propietaria;
    int num_pasajeros;
    double cap_combustible;
    double consum_combustible;
    
    public Vehiculo(String nombre, String empresaPropietaria, int numeroPasajeros, double capacidadCombustible, double consumoCombustible) {
        this.nombre= nombre;
        this.empresa_propietaria = empresaPropietaria;
        this.num_pasajeros = numeroPasajeros;
        this.cap_combustible = capacidadCombustible;
        this.consum_combustible = consumoCombustible;
    }

    public void mostrar() {
        System.out.println("El " + nombre + " de la empresa " + empresa_propietaria + 
                           " puede llevar " + num_pasajeros + " pasajeros con un rango de " + (cap_combustible * consum_combustible)+ " millas.");
    }

    public static void main(String[] args) {
        Vehiculo minivan = new Vehiculo("Minivan", "Cootranar", 11, 29, 22);
        Vehiculo duobus = new Vehiculo("Duo Bus", "Trans Arauca", 40, 28, 35);
        
        minivan.mostrar();
        duobus.mostrar();
    }
}
