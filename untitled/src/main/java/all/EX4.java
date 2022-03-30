package all;

public class EX4 {
    int customerID;
    String customerName;
    String customerAddress;
    int custtomerAge;


    void EX4(String address) {
        customerAddress = address;
        void displayCustomerInformation () {
            System.out.println("customerIdentificationNumber : " + customerID);
            System.out.println("customerName : " + customerName);
            System.out.println("customerAddress: " + customerAddress);
            System.out.println("customerAge: " + custtomerAge);

        }
    }
}
