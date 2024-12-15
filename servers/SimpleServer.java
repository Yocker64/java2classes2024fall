package servers;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Escribe");
            Scanner scan = new Scanner(System.in);
        while (true) {
            Socket socket = server.accept();
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            

            writer.println("This is my greeting for you, my fellow friend");
            writer.close();
        }
        } catch (IOException e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
}
