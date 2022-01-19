
import java.util.ArrayList;

public class ContactsList implements phoneKey {

    private ArrayList<Contact> contacts;

    public ContactsList() {
        contacts = new ArrayList();
    }

    public void ClearList(Contact contact) {
        contacts.clear();
    }

    public void editByPhone(String oldNo, String newNo) {
        for (Contact b : contacts) {
            if (oldNo.equals(b.getPhoneNo())) {
                b.setPhoneNo(newNo);
                break;
            }
        }
    }

    public void editByName(String oldN, String newName) {
        for (Contact c : contacts) {
            if (oldN.equals(c.getName())) {
                c.setName(newName);
                break;
            }
        }
    }

    public void editByAddress(String oldAdd, String newAdd) {
        for (Contact c : contacts) {
            if (oldAdd.equals(c.getAddress())) {
                c.setAddress(newAdd);
                break;
            }
        }
    }

    public void editByEmail(String oldE, String newE) {
        for (Contact c : contacts) {
            if (oldE.equals(c.getEmail())) {
                c.setEmail(newE);
                break;
            }
        }
    }

    public void setContacts(Contact contact) {
        contacts.add(contact);
    }

    public void removeContacts(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public void printInfo() {
        for (Contact c : contacts) {
            System.out.println("Name: " + c.getName() + "\n"
                    + "PhoneNo: " + SA + c.getPhoneNo() + "\n"
                    + "Email: " + c.getEmail() + "\n"
                    + "Address: " + c.getAddress() + "\n"
                    + "-------------------------------------");
        }
        System.out.println("------------End of record------------");
    }

    public String getByPhoneNo(String phoneNo) {
        String temp = "";
        for (Contact c : contacts) {
            if (phoneNo.equals(c.getPhoneNo())) {
                temp = temp
                        + "Name: " + c.getName() + "\n"
                        + "PhoneNo: " + SA + c.getPhoneNo() + "\n"
                        + "Email: " + c.getEmail() + "\n"
                        + "Address: " + c.getAddress() + "\n"
                        + "-------------------------------------";
                return temp;
            }
        }
        return temp;
    }

    public boolean isHere(String phone) {
        for (Contact c : contacts) {
            if (phone.equals(c.getPhoneNo())) {
                return true;
            }
        }
        return false;
    }

}
