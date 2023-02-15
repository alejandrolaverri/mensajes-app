package com.alejandromo.mensajes_app;

import java.util.Scanner;

public class MessageService {

    public static void createMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje:");
        String message = sc.nextLine();

        System.out.println("Escribe tu nombre:");
        String name = sc.nextLine();

        Message recordMessage = new Message();
        recordMessage.setMessage(message);
        recordMessage.setAuthorMessage(name);

        MessageDAO.createMessageDB(recordMessage);
    }

    public static void listMessages() {
        MessageDAO.listMessagesDB();
    }

    public static void deleteMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a borrar: ");
        int idMessage = sc.nextInt();
        MessageDAO.deleteMessageDB(idMessage);
    }

    public static void editMessage() {

    }
}
