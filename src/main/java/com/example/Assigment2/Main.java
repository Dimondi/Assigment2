package com.example.Assigment2;

import com.example.Assigment2.client.Client;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            String readName = null;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please input username:");
            while(readName == null || readName.trim().equals("")){
                readName = scan.nextLine();
                if(readName.trim().equals("")){
                    System.out.println("Invalid. Please enter again:");
                }
            }
            Client client = new Client(readName, "localhost", 12345);
            client.startClient(scan);
        }
}
