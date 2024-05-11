package models;

public class Producto {
    public String nombre;
    public double precio;
    public String categoria;
    public int stock;

    public void inicializarProducto() {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void inicializarProducto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void inicializarProducto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void aplicarDescuento(int porcentaje) {
        if (porcentaje > 0) {
            double descuento = (porcentaje / 100.0) * this.precio;
            this.precio -= descuento;
        }
    }


    public void aplicarDescuentoDirecto(double descuento) {
        if (descuento >= 0) {
            this.precio -= descuento;
        }
    }


    public void incrementarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        }
    }
    public void ajustarStock(int cantidad) {
        if (cantidad >= 0) {
            this.stock = cantidad;
        }
    }
}

