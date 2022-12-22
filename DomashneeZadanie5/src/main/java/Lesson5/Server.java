package Lesson5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Server {
    private List<ClientHandler> clients=new ArrayList<ClientHandler>();
    int PORT=8189;
    public Server(){
        Socket clientSocket=null;
        try {
            ServerSocket serverSocket = new ServerSocket(PORT); // Создаем сокет на сервере
            clients = new LinkedList<>(); // Создаем список клиентов
            // Цикл подключения клиентов
            while (true) { // Подключение клиентов
                System.out.println("Ожидаем подключения клиентов");
                clientSocket = serverSocket.accept(); // Ожидание подключения клиента
                System.out.println("Клиент подключился");
                ClientHandler client=new ClientHandler(this, clientSocket);
                clients.add(client);// Создаем для каждого клиент свой обработчик
            }
        } catch (IOException e) {
            System.out.println("Проблема на сервере");
        }finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
    public synchronized void broadcastMsg(String msg) {
        for (ClientHandler c : clients) {
            c.sendMsg(msg);
        }
    }



    }

