package all;

public class EX5 {
    public static void main (String[] args){
        EX5 objCustomer = new EX5();
        objCustomer.customerID = 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Street";
        objCustomer.custtomerAge = 30;

        objCustomer.displayCustomerInformation();

        objCustomer.changeCustomerAddress("123 Fort, MainStreet");

        objCustomer.displayCustomerInformation();
    }

    }

