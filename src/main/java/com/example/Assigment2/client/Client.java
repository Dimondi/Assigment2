package com.example.Assigment2.client;

import com.example.Assigment2.server.ServerThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final String host = "localhost";
    private static final int portNumber = 12345;

    private String userName;
    private String serverHost;
    private int serverPort;
    private Scanner userInputScanner;

    public String getLastMessage(){
        try {
            BufferedReader my_reader = new BufferedReader(new InputStreamReader(System.in));
            String message = my_reader.readLine();
            return message;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public Client(String userName, String host, int portNumber){
        this.userName = userName;
        this.serverHost = host;
        this.serverPort = portNumber;
    }

    public void startClient(Scanner scan){
        try{
            Socket socket = new Socket(serverHost, serverPort);
            Thread.sleep(1000);

            ServerThread serverThread = new ServerThread(socket, userName);
            Thread serverAccessThread = new Thread(serverThread);
            serverAccessThread.start();
            while(serverAccessThread.isAlive()){
                if(scan.hasNextLine()){
                    serverThread.addNextMessage(scan.nextLine());
                }
                 else {
                    Thread.sleep(200);
                 }
            }
        }catch(IOException ex){
            System.err.println("Fatal Connection error!");
            ex.printStackTrace();
        }catch(InterruptedException ex){
            System.out.println("Interrupted");
        }
    }
}
