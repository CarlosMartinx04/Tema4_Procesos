import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

    public static int puertoServidor = 12345;
    public static void main(String[] args){

        ObjectInputStream entrada;
        ObjectOutputStream salida;

        Socket socketCliente;
        try {

            socketCliente = new Socket("localhost", puertoServidor);
            System.out.println("Socket conectado al servidor: "+socketCliente.getLocalPort());
            entrada = new ObjectInputStream(socketCliente.getInputStream());
            salida = new ObjectOutputStream(socketCliente.getOutputStream());



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
