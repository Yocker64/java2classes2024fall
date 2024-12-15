package servers.Echo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",5000);
            BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Connected");
            while (true) {
                String s = consoleIn.readLine();
                if (s.equals("")) break;
                out.println(s + "\r\n");
                out.flush();
                s = in.readLine();
                System.out.println(s);
            }
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);// TODO: handle exception
        }
    }
}
