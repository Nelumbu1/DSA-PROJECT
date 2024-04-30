package com.example;

public class ClientNode {
    String id;
    ServerNode server;
    HuffCompress compress = new HuffCompress();

    
    //Constructs a new ClientNode instance with the given ID and server reference.

    // id     the unique identifier for this ClientNode instance
    // server the ServerNode instance that this ClientNode will communicate with
    
    public ClientNode(String id, ServerNode server) {
        this.id = id;
        this.server = server;
    }
    //Client method to send
    public void send(String message, String reciveID){
        String compressed_mess = compress.compressMessage(message);
        server.manageMessage(compressed_mess, this.id, reciveID);
    }
    //Client method to recieve
    public void recieve(String message, String senderID){
        System.out.println("Message from: " + message + "");
    }
}
