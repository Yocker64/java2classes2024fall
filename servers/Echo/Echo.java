package servers.Echo;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            Socket socket = server.accept();
            System.out.println("Connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String s;
            while ((s = in.readLine()) != null) {
                out.println(s + "\r\n");
                out.flush();
                System.out.println(s);

            }
            in.close();
            out.close();
            server.close();
            System.out.println("Connection closed");

        } catch (IOException e) {
            System.err.print(e);
            // TODO: handle exception
        }

    }
}
