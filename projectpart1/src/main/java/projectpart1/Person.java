package projectpart1;

/**
 * @author youssef
 */

/**
 * Represents a person with a name, address, and contact number.
 * <p>
 * This class provides constructors and methods to create and manipulate person objects,
 * including validation for the name and contact number.
 * </p>
 */
public class Person {
    private String name;
    private String address;
    private int contactNumber;

    /**
     * Constructs a new Person object with default values.
     */
    public Person() {
    }

    /**
     * Constructs a new Person object with the specified name and contact number.
     * <p>
     * Validates the name to ensure it contains only alphabetic characters and spaces.
     * Throws an InvalidNameException if the name contains invalid characters.
     * </p>
     *
     * @param name          The name of the person.
     * @param contactNumber The contact number of the person.
     */
    public Person(String name, int contactNumber) {
        ////////////////////*Checking the Name*///////////////////////
        try {
            for (int counter = 0; counter < name.length(); counter++) {
                if (((int) name.charAt(counter) >= 97 && (int) name.charAt(counter) <= 122) ||
                        ((int) name.charAt(counter) >= 65 && (int) name.charAt(counter) <= 90) ||
                        (int) name.charAt(counter) == 32) {
                } else {
                    throw new InvalidNameException();
                }
            }
        }
        catch (InvalidNameException e) {
            System.out.println(e);
        }
    }

    /**
     * Constructs a new Person object with the specified name, address, and contact number.
     * <p>
     * Validates the name to ensure it contains only alphabetic characters and spaces.
     * Throws an InvalidNameException if the name contains invalid characters.
     * </p>
     *
     * @param name          The name of the person.
     * @param address       The address of the person.
     * @param contactNumber The contact number of the person.
     */
    public Person(String name, String address, int contactNumber) {
        this(name, contactNumber);
        this.address = address;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the address of the person.
     *
     * @return The address of the person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the person.
     *
     * @param address The new address of the person.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the contact number of the person.
     *
     * @return The contact number of the person.
     */
    public int getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the contact number of the person.
     * <p>
     * Validates the contact number to ensure it contains only numeric characters.
     * If the contact number contains invalid characters, prints an error message and does not set the contact number.
     * </p>
     *
     * @param contactNumber The new contact number of the person.
     */
    public void setContactNumber(int contactNumber) {
        int tempcontactNumber = contactNumber;
        boolean contactNoFlag = true;
        while (tempcontactNumber > 0) {
            int remainder = tempcontactNumber % 10;
            if ((char) remainder >= 30 && (char) remainder <= 39) {
            } else {
                contactNoFlag = false;
                break;
            }
            tempcontactNumber = tempcontactNumber / 10;
        }
        if (contactNoFlag) this.contactNumber = contactNumber;
        else System.out.println("Invalid Number, Please Try Again");
    }
}

