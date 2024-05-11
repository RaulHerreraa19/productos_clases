package principal;

import models.Alimento;
import models.Electrodomestico;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var cantidad = 0;
        var nombre = "";

//        System.out.println("Introduce el nombre de tu producto");
//        nombre = input.nextLine();
//        Alimento alimento1 = new Alimento( nombre,100,"Alimento");
//        System.out.println("Para continuar necesitas recargar tu stock de tu producto: " + alimento1.nombre +
//                " Por favor introduce la cantidad que deseas comprar:");
//
//         cantidad = input.nextInt();
//        alimento1.incrementarStock(cantidad);
//        System.out.println("precio normal: " + alimento1.precio);
//        System.out.println("Introduce el descuento de tu producto");
//        cantidad = input.nextInt();
//        alimento1.aplicarDescuento(cantidad);
//        System.out.println("precio con descuento: " + alimento1.precio);
//         System.out.println("Su stock se recargó, ahora cuenta con un stock de: " + alimento1.stock);
//         alimento1.incrementarStock(50);
//        System.out.println(alimento1.stock);

        Electrodomestico electrodomestico = new Electrodomestico("Lavadora", 5500.99, "Electrodomestico",0);




    }
}
