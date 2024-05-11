package models;

public class Alimento extends Producto {

    public Alimento(String nombre, double precio, String categoria, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        if(stock == 0){
            System.out.println("Producto: " + nombre + ", Su precio es de: " + precio + ", Pertenece a la categoria de: " + categoria);
            System.out.println("Su stock de este producto es de: " + stock + " Favor de rellenar el inventario de este producto");
        }
    }
}

