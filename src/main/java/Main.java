import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        int port = 20777;
        UdpUnicastClient client = new UdpUnicastClient(port);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(client);
    }
}
