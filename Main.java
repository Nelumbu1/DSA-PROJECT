//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServerNode server= new ServerNode();

        ClientNode Fidel = new ClientNode("222055030");

        Fidel.send("This is a message", server);



    }
}