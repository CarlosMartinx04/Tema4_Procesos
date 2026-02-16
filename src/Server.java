import java.io.*;
import java.net.ServerSocket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int puerto = 12345;
    private static ServerSocket serverSocket;
    public static void main(String[] args) throws IOException {

        try{
            serverSocket = new ServerSocket(puerto);
            System.out.println("Puerto establecido");

        } catch (IOException e) {
            System.out.println("Error al escuchar en los canales E/S.");
            throw new RuntimeException(e);
        }

        ObjectOutputStream outObject;
        ObjectInputStream inpObject;

        try{

        }

    }
}