
public abstract class PhoneBook {

    String name;
    String PhoneNo;

    public PhoneBook(String PhoneNo, String name) {
        this.PhoneNo = PhoneNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public void printInfo() {
        System.out.println("Contact info:\nName: " + this.name + "\n");
    }

}
