package com.example;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Star network = new Star();
        boolean running = true;
        Scanner input = new Scanner(System.in);
        ClientNode sender;

        //Arrays to store the users input
        String[] sendArr = new String[10];
        String[] recieveArr = new String[10];
        String[] messagesArr = new String[10];
        //Will keep the program in a loop until the user exits
        while (running){
            //Menu
            System.out.println("Enter Number to Choose the option below:");
            System.out.println("1. Insert \n2. Remove \n3. Show \n4. Send Message \n5. Exit");
            System.out.println("Enter command: ");
            try{
            String command = input.next();
            
            //If statement to execute the command
            if (command.equals("1")){// Insert a new client to the network
                System.out.println("Enter ID: ");
                    String id = input.next();
                    network.insert(id);
            }
            else if (command.equals("2")){// Remove a client from the network
                System.out.println("Enter ID: ");
                    String id = input.next();
                    network.remove(id);
            }
            else if (command.equals("3")){// Show all the clients in the network
                System.out.println("Clients in the network: ");
                network.show();
            }
            else if (command.equals("4")){// Send a messages to a client
                System.out.println("Enter number of messages to send: ");
                int num = input.nextInt();
                //Loop to get the sender, reciever, and message
                for(int i = 0; i < num; i++){
                    System.out.println("Enter sender ID: ");
                    String sendIDString = input.next();
                    
                    System.out.println("Enter recieve ID: ");
                    String recieveIDString = input.next();
                    System.out.println("Enter message: ");
                    input.nextLine();
                    String message = input.nextLine();
                    
                    sendArr[i] = sendIDString;
                    recieveArr[i] = recieveIDString;
                    messagesArr[i] = message;

                }
                //Loop to send the messages to the clients
                for(int i = 0; i< num ; i++){
                    String sendIDString = sendArr[i];
                    String recieveIDString = recieveArr[i];
                    String message = messagesArr[i];
                    sender = network.clients.get(sendIDString);
                    System.out.print("\n");
                    sender.send(message,recieveIDString);
                    System.out.print("\n");
                }
                
            }

            else if (command.equals("5")){// Exit the program
                running = false;
            }
            else {
                System.out.println("Invalid Command");// If the command is invalid, print error message
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
        }
    }
}