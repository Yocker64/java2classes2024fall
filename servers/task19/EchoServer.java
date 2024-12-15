package servers.task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            while (true) {
                Socket socket = server.accept(); 
                ServerSockets thread = new ServerSockets(socket); 
                thread.start(); 
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
