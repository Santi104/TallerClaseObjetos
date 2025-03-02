
package com.mycompany.cuenta;

public class Cuenta {
    private String titular;
    private double total;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.total = 5000;
        this.cantidad = 0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.total = 5000;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            total = total + cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if ((total-cantidad) < 0) {
                total = 0;
            }else {
               total = total - cantidad;
            }
        }
    }

    public void mostrar() {
        System.out.println("el titular es: " + titular);
        System.out.println("Su saldo es de: " + total);
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Juan Perez");
        Cuenta cuenta2 = new Cuenta("Maria Lopez", 2000);
        
        cuenta1.ingresar(1500);
        cuenta2.retirar(2500);
        
        cuenta1.mostrar();
        cuenta2.mostrar();
    }
}
