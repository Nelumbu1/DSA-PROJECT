public class ClientNode {
    private final String id;

    // Constructor to initialize the client node with a unique ID
    public ClientNode(String id) {
        this.id = id;
    }

    // Send method to send a message to the server (wrapper method)
    public void send(String message, ServerNode server) {
        server.forwardMessage(this.id, message);
    }

    // Receive method to print the received message and sender's ID
    public void receive(String senderId, String message) {
        System.out.println("Received message from " + senderId + ": " + message);
    }

    // Getter method to retrieve the client node's ID
    public String getId() {
        return id;
    }



    public void receiveMessage(String message) {




    }

    public static void main(String[] args) {

    }
}
