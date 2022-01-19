
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, opt;
        Contact cont = null;
        ContactsList list = new ContactsList();
        try {
            do {
                System.out.println("[1]Add contacts\n[2]Delete Contact\n"
                        + "[3]Search contacts\n[4]Display All\n"
                        + "[5]Edit contact\n[6]Clear all the list\n[7]Exit\n");
                System.out.println("Warning if you want to enter multiple strings "
                        + "in one atrribute just sepetate them with a - sign");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter phone number: ");
                        String phoneNo = input.next();
                        System.out.println("Enter Email: ");
                        String email = input.next();
                        System.out.println("Enter address: ");
                        String address = input.next();
                        System.out.println("Enter name: ");
                        String name = input.next();

                        cont = new Contact(phoneNo, name, email, address);
                        list.setContacts(cont);
                        break;
                    case 2:
                        System.out.println("Enter phone number to delete contact: ");
                        String deleteContact = input.next();
                        if (deleteContact.equals(cont.getPhoneNo())) {
                            list.removeContacts(cont);
                        } else {
                            System.out.println("Not found!!");
                        }
                        break;
                    case 3:
                        System.out.println("Type phone number to search");
                        String nsf = input.next();
                        System.out.println(list.getByPhoneNo(nsf));
                        break;

                    case 4:
                        System.out.println("----------Phone Book record----------");
                        list.printInfo();
                        break;
                    case 5:
                        System.out.println("Enter contact number that "
                                + "you want to edit: ");
                        String editor = input.next();
                        input.nextLine();
                        if (list.isHere(editor) == true) {
                            list.getByPhoneNo(editor);
                            System.out.println("choose what you want to edit: ");
                            System.out.println("[1]Phone Number\n[2]Email\n"
                                    + "[3]Address\n[4]Name\n");
                            opt = input.nextInt();
                            if (opt == 1) {
                                System.out.println("Enter old number for confirmation");
                                String oldNo = input.next();
                                System.out.println("Enter new number");
                                String newNo = input.next();
                                list.editByPhone(oldNo, newNo);
                                System.out.println("Contact list has been updated");
                            } else if (opt == 2) {
                                System.out.println("Enter old Email: ");
                                String oldE = input.next();
                                System.out.println("Enter new Email");
                                String newE = input.next();
                                list.editByEmail(oldE, newE);
                                System.out.println("Contact list has been updated");
                            } else if (opt == 3) {
                                System.out.println("Enter old address: ");
                                String oldAdd = input.next();
                                System.out.println("Enter new Address");
                                String newAdd = input.next();
                                list.editByAddress(oldAdd, newAdd);
                                System.out.println("Contact list has been updated");
                            } else if (opt == 4) {
                                System.out.println("Enter old name: ");
                                String oldN = input.next();
                                System.out.println("Enter new name");
                                String newN = input.next();
                                list.editByName(oldN, newN);
                                System.out.println("Contact list has been updated");
                            } else {
                                System.out.println("Wrong choice");
                            }
                        } else {
                            System.out.println("Number not found!!");
                        }
                        break;
                    case 6:
                        list.ClearList(cont);
                        System.out.println("List have been cleared!!");
                        break;
                    case 7:
                        System.out.println("Exitting.....");
                        break;
                    default:
                        System.out.println("Wrong input!!");
                }
            } while (choice != 7);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
