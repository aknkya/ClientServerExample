import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        dout.writeUTF("Hello Serdsfsver");
        dout.flush();
        dout.close();
        socket.close();
    }
}







