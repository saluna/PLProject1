package kothari.customer;

public class CustomerDB {

    public static void main(String[] args) {


    }

    public static Customer getcustNum(String custNum){
        // create the Product object
        Customer customer = new Customer();

        // fill the Customer object with data
        customer.setcustNum(custNum);
        if (custNum.equals("1001")) {
            customer.setfull_name("Barbara White");
            customer.setaddress("3400 Richmond Parkway #3423");
            customer.setcity("Bristol");
            customer.setstate("CT");
            customer.setpostalCode("06010");
        }
        else if (custNum.equals("1002")) {
            customer.setfull_name("Karl Vang");
            customer.setaddress("327 Franklin Street");
            customer.setcity("Edina");
            customer.setstate("MN");
            customer.setpostalCode("55435");
        }

        else if (custNum.equals("1003")) {
            customer.setfull_name("Ronda Chavan");
            customer.setaddress("518 Commanche Dr.");
            customer.setcity("Greensboro");
            customer.setstate("NC");
            customer.setpostalCode("27410");
        }

        else {
            customer.setfull_name("Unknown");
        }

        return customer;
    }
}
