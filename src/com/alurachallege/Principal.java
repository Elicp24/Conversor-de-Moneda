package com.alurachallege;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaConvertidor consultaConvertidor = new ConsultaConvertidor();
        int opcion = 0;
        double cantidad = 0;


        System.out.println("**************************************************");
        System.out.println("Bien bienvenido a convertidor de monedas");
        System.out.println("**************************************************");
        System.out.println("Elija una opcion valida: ");
        System.out.println(" ");
        String menu = ("""  
                1 ) Dolar =>> Colones
                2 ) Colones =>> Dolar
                3 ) Dolar =>> Real brasileño
                4 ) Real brasileño =>> Dolar
                5 ) Dolar =>> Peso colombiano
                6 ) Peso colombiano =>> Dolar
                7 ) Salir """);


        Scanner teclado = new Scanner(System.in);

        try {
            while (opcion != 7) {
                System.out.println(menu);
                System.out.println("**************************************************");
                opcion = teclado.nextInt();


                switch (opcion) {

                    case 1:
                        String base_Code = "USD", target_Code = "CRC";
                        System.out.println("**************************************************");
                        System.out.println("Ingresa el monto de dolares: ");
                        double montoUSD = teclado.nextDouble();
                        Convertidor montoUsdFromCrc = consultaConvertidor.Convertidor(base_Code = "USD", target_Code = "CRC", montoUSD);
                        System.out.println("1 ) Tipo de cambio a colones es: " + montoUsdFromCrc);
                        System.out.println("**************************************************");
                        break;




                }

            }
        } catch (Exception e) {
            throw new RuntimeException("No se puedo realizar el cambio de moneda");

        }
    }
}


