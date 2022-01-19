
public class Contact extends PhoneBook {

    private String email, address;

    public Contact(String phoneNo, String name) {
        super(phoneNo, name);
    }

    public Contact(String phoneNo, String name, String email, String address) {
        super(phoneNo, name);
        this.email = email;
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPhoneNo() {
        return PhoneNo;
    }

    @Override
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Email: " + this.email + "\nAddress: " + this.address + "\n");
    }

}
