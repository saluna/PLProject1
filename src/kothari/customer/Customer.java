/**
 * Created by avnikothari on 1/28/16.
 */
public class Customer {

    public static void main(String[] args) {
        String test = "Hello World!";
        System.out.println(test);
    }

    // setting instance variables
    private String full_name;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    // the constructor
    public Customer() {
        full_name = "";
        address = "";
        city = "";
        state = "";
        postalCode = "";
    }

    // get and set methods to provide access
    // to all instance variables
    public void setfull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getfull_name() {
        return full_name;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return address;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getcity() {
        return city;
    }

    public void setstate(String state) {
        this.state = state;
    }

    public String getstate() {
        return state;
    }

    public void setpostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getpostalCode() {
        return postalCode;
    }

    // getNameAndAddress
    public void printToConsole() {
        System.out.println(
                full_name + '\n' +
                        address + '\n' +
                        city + ', ' + state + ' ' + postalCode
                        +
        );
    }



}
