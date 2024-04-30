package com.example;
import java.util.*;
public class Star {
    ServerNode server;
    Map<String, ClientNode> clients = new HashMap<>();

    public Star() {
        server = new ServerNode();
    }

    public void insert(String id){
        ClientNode new_client = new ClientNode(id, server);
        clients.put(id, new_client);
    }

    public void remove(String id){
        clients.remove(id);
    }

    public void show(){
        for (String client : clients.keySet()) {
            System.out.println(client);
        }
    }

}
