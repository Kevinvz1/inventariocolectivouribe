package Kevin;

import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption;
        String colorVerde="\u001B[32m";

        //PROCESO 1 (Crear el menu Opciones)
        System.out.println("***********************");
        System.out.println("\n***** URIBE APP *****");
        System.out.println("***********************");

        System.out.println("\n👕 Bienvenido al gestor de prendas...");
        System.out.println("📋 ¿Qué deseas realizar?");
        System.out.println(colorVerde+"1️⃣  Guardar una prenda en la base de datos 🧵");
        System.out.println("2️⃣  Mostrar el inventario de prendas 📦");
        System.out.println("3️⃣  Modificar los datos de una prenda 🛠️");
        System.out.println("4️⃣  Eliminar una prenda del sistema ❌");
        System.out.println("5️⃣  Presiona 5 para salir 🚪");


        

    }
}
