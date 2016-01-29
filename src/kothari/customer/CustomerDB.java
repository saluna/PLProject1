package kothari.customer;

/**
 * Created by avnikothari on 1/28/16.
 */
public class CustomerDB {

    public static void main(String[] args) {


    }

    public static String getCustomer(int custNum){
        if(custNum == 1001){
            return "1001\nBarbara White\n" +
                    "3400 Richmond Parkway #3423\n" +
                    "Bristol, CT 06010";
        }
        else if (custNum == 1002){
            return "1002\nKarl Vang\n327 Franklin Street\nEdina, MN 55435\n";
        }
        else if (custNum == 1003){
            return "1003\nRonda Chavan\n" +
                    "518 Commanche Dr.\n" +
                    "Greensboro, NC 27410";
        }
        else
            return "There is no customer number " + custNum + " in our records.";

    }

}
