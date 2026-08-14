import java.util.Scanner;
public class acertijo_interactivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] acertijos = {
            "Tengo agujas y no se coser, tengo numeros y no se leer. ¿Que soy?",
            "Cuanto mas quitas, mas grande se vuelve. ¿Que es?",
            "Tengo dientes y no puedo comer. ¿Que soy?",
            "Vuelo sin alas y lloro sin ojos. ¿Que soy?",
            "Tiene cuello pero no cabeza. ¿Que es?"
        };
        String[][] opciones = {
            {"Un reloj", "Una computadora", "Un libro", "Una ventana"},
            {"Un agujero", "Una caja", "Una puerta", "Una montaña"},
            {"Un peine", "Un perro", "Un zapato", "Un arbol"},
            {"Una nube", "Un avion", "Un pajaro", "Un globo"},
            {"Una botella", "Una persona", "Una camisa", "Una mesa"}
        };
        int[] respuestas = {1, 1, 1, 1, 1};
        int correctas = 0;
        int incorrectas = 0;
        int puntuacion = 0;
        int opcion;
        //--------------------------------------------//
        //--|menu_principal_de_acertijo_interactivo|--//
        //--------------------------------------------//
        do {
            System.out.println("menu principal de acertijo interactivo");
            System.out.println("1) Iniciar partida");
            System.out.println("2) Ver puntuacion");
            System.out.println("3) Ver acertijos");
            System.out.println("4) Reiniciar partida");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                //---------------------//
                //--|iniciar_partida|--//
                //---------------------//
                case 1:
                    System.out.println("inicio de partida");
                    for (int i = 0; i < acertijos.length; i++) {
                        System.out.println();
                        System.out.println("Acertijo " + (i + 1) + ":");
                        System.out.println(acertijos[i]);
                        for (int j = 0; j < opciones[i].length; j++) {
                            System.out.println((j + 1) + ") " + opciones[i][j]);
                        }
                        System.out.print("Seleccione una respuesta: ");
                        int respuesta = entrada.nextInt();
                        if (respuesta >= 1 && respuesta <= 4) {
                            if (respuesta == respuestas[i]) {
                                System.out.println("Respuesta correcta.");
                                correctas++;
                                puntuacion += 10;
                            } else {
                                System.out.println("Respuesta incorrecta.");
                                System.out.println("La respuesta correcta era: " + opciones[i][respuestas[i] - 1]);
                                incorrectas++;
                            }
                        } else {
                            System.out.println("Respuesta no valida.");
                            incorrectas++;
                        }
                        System.out.println("Puntos: " + puntuacion);
                    }
                    System.out.println();
                    System.out.println("Resultado de la partida");
                    System.out.println("Correctas: " + correctas);
                    System.out.println("Incorrectas: " + incorrectas);
                    System.out.println("Puntuacion: " + puntuacion + " puntos");
                    break;
                //--------------------//
                //--|ver_puntuacion|--//
                //--------------------//
                case 2:
                    System.out.println("puntuacion actual");
                    System.out.println("Correctas: " + correctas);
                    System.out.println("Incorrectas: " + incorrectas);
                    System.out.println("Puntuacion: " + puntuacion + " puntos");
                    break;
                //-------------------//
                //--|ver_acertijos|--//
                //-------------------//
                case 3:
                    System.out.println("lista de acertijos");
                    for (int i = 0; i < acertijos.length; i++) {
                        System.out.println("ID: " + (i + 1) + " | Acertijo: " + acertijos[i]);
                    }
                    break;
                //-----------------------//
                //--|reiniciar_partida|--//
                //-----------------------//
                case 4:
                    correctas = 0;
                    incorrectas = 0;
                    puntuacion = 0;
                    System.out.println("Partida reiniciada correctamente.");
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 5:
                    System.out.println("Gracias por utilizar Acertijo Interactivo.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
        entrada.close();
    }
}