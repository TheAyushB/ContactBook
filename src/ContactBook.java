import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ContactBook {

    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            showMenu();
            try {
                int choice = Integer.parseInt((scanner.nextLine()));

                switch (choice) {
                    case 1: addContact(); break;
                    case 2: viewContacts(); break;
                    case 3: searchContact(); break;
                    case 4: deleteContact(); break;
                    case 5: running = false; break;
                    default:
                        System.out.println("Invalid Choice. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n---------Contact Book--------");
        System.out.println("1. Add Contact");
        System.out.println("2. View All Contacts");
        System.out.println("3. Search Contact by Name");
        System.out.println("4. Delete Contact by Name");
        System.out.println("5. Exit");
        System.out.println("Choose an option: ");
    }

    private static void addContact() {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(name, phone, email);
        contacts.add(newContact);
        System.out.println("Contact added successfully!");
    }

    private static void sortContactsByName() {
        contacts.sort(Comparator.comparing(Contact::getName, String.CASE_INSENSITIVE_ORDER));
    }

    private static void viewContacts() {
        if(contacts.isEmpty()) {
            System.out.println("No contacts to display");
            return;
        }
        sortContactsByName();

        for(Contact  contact: contacts) {
            contact.displayContact();
            System.out.println("-------------------------------");
        }
    }

    private static void searchContact() {
        System.out.println("Enter name to search: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Contact contact : contacts) {
            if(contact.getName().equalsIgnoreCase(name)) {
                contact.displayContact();
                found = true;
            }
        }
        if(!found) System.out.println("Contact not found.");
    }

    private static void deleteContact() {
        System.out.println("Enter name to delete: ");
        String name = scanner.nextLine();

        Iterator<Contact> iterator = contacts.iterator();
        boolean deleted = false;

        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if(contact.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Contact Removed.");
                deleted = true;
            }
        }
        if (!deleted) System.out.println("Contact not found.");
    }

}
















