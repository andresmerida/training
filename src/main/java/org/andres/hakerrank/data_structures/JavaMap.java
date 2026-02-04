package org.andres.hakerrank.data_structures;

import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    static void main() {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine();     // consume the newline after the integer

            Map<String, Integer> phoneBook = new java.util.HashMap<>();
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine().toLowerCase();
                int phone = scanner.nextInt();
                scanner.nextLine(); // consume a new line
                phoneBook.put(name, phone);
            }

            while (scanner.hasNext()) {
                String query = scanner.nextLine().toLowerCase();
                if (phoneBook.containsKey(query)) {
                    System.out.println(query + "=" + phoneBook.get(query));
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
}
