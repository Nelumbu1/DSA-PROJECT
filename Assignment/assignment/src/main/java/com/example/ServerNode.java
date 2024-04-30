package com.example;

public class ServerNode {
    ClientNode sender;
    
    //Manages a message received from a client.
     
    //message The content of the message.
    //sendID The ID of the client that sent the message.
    //reciveID The ID of the client that should receive the message.
    
    public void manageMessage(String message, String sendID,String reciveID){
        System.out.println("Message from: " + sendID + " to: " + reciveID + " Message:" + message);
    }    
}
