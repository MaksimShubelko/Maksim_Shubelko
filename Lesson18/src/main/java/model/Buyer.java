package model;

import lombok.*;
import tasks.first.com.home.utils.Printer;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;

@Getter
@Setter
@RequiredArgsConstructor
public class Buyer extends Thread {
    private ArrayList<Product> products = new ArrayList<>();
    @NonNull
    private Semaphore sem;
    @NonNull
    private int number;

    public void addProduct(Product product) {
        products.add(product);
    }

    @SneakyThrows
    @Override
    public void run() {
            sem.acquire();
            Printer.print("Покупатель " + number + ":");
            Printer.print(products
                    .stream()
                    .map(Product::getName)
                    .collect(Collectors.toList())
                    .toString());
            sem.release();
    }
}
