package proxy;

import org.springframework.validation.annotation.Validated;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class DbConnection implements Connection {

    public DbConnection() {
        try {
            System.out.print("Creating connection......");
            Thread.sleep(10_000L);
            System.out.println("done");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void connect(String user, String password) {
        try {
            CompletableFuture.runAsync(() -> {
                try {
                    System.out.printf("Connection initializing for user %s with passwd %s......", user, password);
                    Thread.sleep(5_000L);
                    System.out.println("done");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    void checkConnection() {
        System.out.println("Feel good...");
    }
}
