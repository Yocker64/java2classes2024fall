package servers.task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSockets extends Thread {
    Socket socket;

    public ServerSockets(Socket s) {
        socket = s;
    }

    public void run() {
        try {
            System.out.println("Connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String s = "";
            while (s != null) { 
                s = in.readLine();
                out.print(s + "\r\n");
                out.flush();
                System.out.println(s);
                
            }
            socket.close(); 
            System.out.println("Connection Closed");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
