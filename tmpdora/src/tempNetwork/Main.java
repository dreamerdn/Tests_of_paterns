package tempNetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 разбить алгоритм на последовательность шагов,
 описать эти шаги в отдельных методах и вызывать их
 в одном шаблонном методе друг за другом.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Вводим сообщение.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Instagram\n" +
                "2 - VK");
        int choice = Integer.parseInt(reader.readLine());

        // Создаем сетевые объекты и публикуем пост.
        if (choice == 1) {
            network = new Instagram(userName, password);
        } else if (choice == 2) {
            network = new VK(userName, password);
        }
        network.post(message);
    }
}