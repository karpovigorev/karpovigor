import java.io.*;
import java.util.*;

public class Phonebook {
    private Map<String, String> contacts;

    public Phonebook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public String getPhone(String name) {
        return contacts.get(name);
    }

    public void importFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] parts = line.split(":");
                    addContact(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName);
            e.printStackTrace();
        }
    }

    public void exportToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error writing file " + fileName);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.importFromFile("contacts.txt");
        phonebook.addContact("John", "123-456-7890");
        phonebook.exportToFile("contacts.txt");
    }
}
