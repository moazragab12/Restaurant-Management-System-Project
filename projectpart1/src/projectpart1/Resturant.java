package projectpart1;

/**
 *
 * @author youssef
 */
public class Resturant {
    private String name;
    private String address;
    private  int tablesNumber;
    private Stuff employees;
    protected static Tables[] tables;
    //constructor
    public Resturant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Resturant(String name, String address, int tablesNumber,  Stuff employees) {
        this(name, address);
        if(employees!=null)
            this.employees = employees;
        else System.out.println("Employees is Null");

        if(tablesNumber<0) System.out.println("Invalid Number of Tables, enter Positive number");
        else {
            this.tables = new Tables[tablesNumber];
            for(int i=0; i<tablesNumber; i++) {
                tables[i] = new Tables("empty");
            }
        }
    }

    public String getName() {
        return name;
    }
    //setter and getter
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTablesNumber() {
        return tablesNumber;
    }

    protected void setTablesNumber(int tablesNumber) {
        this.tablesNumber = tablesNumber;
    }

    public static Tables[] getTables() {
        return tables;
    }

    public void setTables(Tables[] tables) {
        this.tables = tables;
    }

    public Stuff getEmployees() {
        return employees;
    }

    public void setEmployees(Stuff employees) {
        this.employees = employees;
    }
}
