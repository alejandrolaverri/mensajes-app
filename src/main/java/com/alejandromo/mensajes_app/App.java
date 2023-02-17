package com.alejandromo.mensajes_app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static String menuMessage = ("---------------------\n"
                                 + "Aplicación de mensajes \n"
                                 + "1. Crear mensaje \n"
                                 + "2. Listar mensajes \n"
                                 + "3. Editar mensaje \n"
                                 + "4. Eliminar mensaje \n"
                                 + "5. Salir \n");
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(menuMessage);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> MessageService.createMessage();
                case 2 -> MessageService.listMessages();
                case 3 -> MessageService.editMessage();
                case 4 -> MessageService.deleteMessage();
                default -> {
                }
            }
        } while (opcion != 5);
    }
}
