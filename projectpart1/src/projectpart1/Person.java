
package projectpart1;

/**
 *
 * @author youssef
 */
public class Person {
    private final String name;
    private String address;
    private int contactNumber;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public Person(String name, String address, int contactNumber) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
}
