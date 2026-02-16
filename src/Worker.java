import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Worker extends Thread {
    public static Scanner sc = new Scanner(System.in);
    ServerSocket serverSocket;

    public Worker(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        super.run();

        BufferedReader entrada;
        PrintWriter salida;
        ObjectOutputStream salidaOjbect;
        ObjectInputStream entradaObject;

        while(true){
            try {
                //Aceptar al cliente y declarar los canales de entrada y salida con él.
                Socket socketCliente = serverSocket.accept();
                entrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
                salida = new PrintWriter(new OutputStreamWriter(socketCliente.getOutputStream()));
                salidaOjbect = new ObjectOutputStream(socketCliente.getOutputStream());
                entradaObject = new ObjectInputStream(socketCliente.getInputStream());

                System.out.println("Socket"+socketCliente.getPort()+ " conectado");
                salida.println("Deseas Descargar/Subir");

                seleccionarAccion();


            } catch (IOException e) {
                System.out.println("Error al conectar al socket Cliene");
                throw new RuntimeException(e);
            }

        }

    }

    public static void seleccionarAccion(){

        String opcion = sc.next();

        if(opcion.equalsIgnoreCase("descargar")){
            System.out.println("Descargar");
        } else if(opcion.equalsIgnoreCase("subir")){
            System.out.println("Subir");
        }

    }

}
