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
                    System.out.println("Elija una opcion valida: ");
                    System.out.println(" ");
                    System.out.println(menu);
                    System.out.println(" ");
                    System.out.println("**************************************************");
                    opcion = teclado.nextInt();



                    switch (opcion) {

                        case 1:
                            String base_Code = "USD", target_Code = "CRC";
                            System.out.println("**************************************************");
                            System.out.println("Ingresa el monto de dolares: ");
                            double montoUSD = teclado.nextDouble();
                            Convertidor montoUsdFromCrc = consultaConvertidor.Convertidor(base_Code = "USD", target_Code = "CRC", montoUSD);
                            System.out.println("1 ) Tipo de cambio a colones es: " + montoUsdFromCrc.conversion_result());
                            System.out.println("**************************************************");
                            break;

                        case 2:
                            System.out.println("**************************************************");
                            System.out.println("Ingresa el monto de Colones: ");
                            double montoCRC = teclado.nextDouble();
                            Convertidor montoCrcFromUsd = consultaConvertidor.Convertidor(base_Code = "CRC", target_Code = "USD", montoCRC);
                            System.out.println("1 ) Tipo de cambio a Dolares es: " + montoCrcFromUsd.conversion_result());
                            System.out.println("**************************************************");
                            break;

                        case 3:
                            System.out.println("**************************************************");
                            System.out.println("Ingresa el monto de Dolares: ");
                            double montoUSD2 = teclado.nextDouble();
                            Convertidor montoUsdFromBrl = consultaConvertidor.Convertidor(base_Code = "USD", target_Code = "BRL", montoUSD2);
                            System.out.println("1 ) Tipo de cambio a Real brasileño es: " + montoUsdFromBrl.conversion_result());
                            System.out.println("**************************************************");
                            break;

                        case 4 :
                            System.out.println("**************************************************");
                            System.out.println("Ingresa el monto de Real brasileño: ");
                            double montoBRL = teclado.nextDouble();
                            Convertidor montoBrlFromUsd = consultaConvertidor.Convertidor(base_Code = "BRL", target_Code = "USD", montoBRL);
                            System.out.println("1 ) Tipo de cambio a Dolares es: " + montoBrlFromUsd.conversion_result());
                            System.out.println("**************************************************");
                            break;

                        case 5 :
                            System.out.println("**************************************************");
                            System.out.println("Ingresa el monto de Dolares: ");
                            double montoUSD3 = teclado.nextDouble();
                            Convertidor montoUsdFromCop = consultaConvertidor.Convertidor(base_Code = "USD", target_Code = "COP", montoUSD3);
                            System.out.println("1 ) Tipo de cambio a Peso colombiano es: " + montoUsdFromCop.conversion_result());
                            System.out.println("**************************************************");
                            break;

                        case 6 :
                            System.out.println("**************************************************");
                            System.out.println("Ingresa el monto de Peso colombiano: ");
                            double montoCOP = teclado.nextDouble();
                            Convertidor montoCopFromUsd = consultaConvertidor.Convertidor(base_Code = "COP", target_Code = "USD", montoCOP);
                            System.out.println("1 ) Tipo de cambio a Dolares es: " + montoCopFromUsd.conversion_result());
                            System.out.println("**************************************************");
                            break;

                        case 7:
                            System.out.println("Gracias por preferirnos, vuelva pronto!!!");
                    }

                }
            } catch (Exception e) {
                throw new RuntimeException("No se puedo realizar el cambio de moneda");

            }
        }
    }


