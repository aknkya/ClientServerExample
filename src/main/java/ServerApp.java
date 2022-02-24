import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        DataInputStream dataInputStream= new DataInputStream(socket.getInputStream());
        String str=dataInputStream.readUTF();
        System.out.println("gelen mesaj " + str);

        serverSocket.close();
    }
}
