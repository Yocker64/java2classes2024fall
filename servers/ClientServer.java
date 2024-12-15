package servers;

import java.io.BufferedReader;
import java.io.IO;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",5000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = reader.readLine();
            System.out.printf("Message from the server: %s", message);
            reader.close();
        } catch (IOException e) {
            System.out.println(e);// TODO: handle exception
        }
    }
}
