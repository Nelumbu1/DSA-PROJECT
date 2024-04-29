
import java.util.*;

public class ServerNode {

    private final List<ClientNode> clients;

    public ServerNode() {
        this.clients = new ArrayList<>();
    }

    // Method to add a client to the server
    public void addClient(ClientNode client) {
        clients.add(client);
    }

    // Method to remove a client from the server
    public void removeClient(ClientNode client) {
        clients.remove(client);
    }

    // Method to broadcast a message to all connected clients
    public void broadcastMessage(String message) {
        for (ClientNode client : clients) {
            client.receiveMessage(message);
        }
    }
    public void forwardMessage(String recipientId, String message) {
        // Here, we're just printing the message as an example
        // In a real-world scenario, you would forward the message to the appropriate client
        // based on the recipientId
        System.out.println("Forwarding message to " + recipientId);
    }

}
