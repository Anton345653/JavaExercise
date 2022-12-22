package Lesson5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
private Server server;
private Socket socket;
private DataInputStream in;
private DataOutputStream out;
private String name;

    public String getName() {
        return name;
    }
    public ClientHandler(Server server,Socket socket){
        try {
        this.server=server;
        this.socket=socket;
        this.in=new DataInputStream(socket.getInputStream());
        this.out=new DataOutputStream(socket.getOutputStream());
        this.name="";
        new Thread(()->{
           try{
             //  readMessages();
         //  }catch (IOException e){
          //     e.printStackTrace();
           }
           finally {
            //   closeConnection();
           }
        }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void readMessage() throws IOException {
        while (true) {
            String clientStr = in.readUTF();
            System.out.println("От: " + this.name + ": " + clientStr);
            if (clientStr.equals("/end")) {
                return;
            }

            server.broadcastMsg(this.name + ": " + clientStr);



}}
    public void sendMsg(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

