package decorator;

public class SimpleEmailSender implements Sender {

    @Override
    public void send(String message) {
        System.out.printf("Sending a message: %s%n", message);
    }
}
