package projectpart1;

/**
 *
 * @author youssef
 */
public class Person {
    private String name;
    private String address;
    private int contactNumber;

    public Person() {}

    public Person(String name, int contactNumber) {
        ////////////////////*Checking the Name*///////////////////////
        try{
            for(int counter=0;counter<name.length();counter++){
                if (((int) name.charAt(counter)>= 97 && (int) name.charAt(counter)<= 122) ||
                        ((int) name.charAt(counter)>= 65 && (int) name.charAt(counter)<= 90)  ||
                        (int) name.charAt(counter)== 32) {
                }
                else {
                    throw new InvalidNameException();
                }
            }
        }catch(InvalidNameException e){
            System.out.println(e);
        }
    }

    public Person(String name, String address, int contactNumber) {
        this(name,contactNumber);
        this.address = address;
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
        int tempcontactNumber = contactNumber;
        boolean contactNoFlag = true;
        while(tempcontactNumber>0) {
            int remainder = tempcontactNumber % 10;
            if((char)remainder >=30 && (char)remainder <=39 ){}
            else {
                contactNoFlag =false;
                break;
            }
            tempcontactNumber = tempcontactNumber / 10;
        }
        if(contactNoFlag) this.contactNumber = contactNumber;
        else System.out.println("Invalid Number, Please Try Again");
    }
}

