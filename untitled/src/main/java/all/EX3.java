package all;

public class EX3 {

    int customerID;
    String customerName;
    String customerAddress;
    int custtomerAge;

    public static void main(String[] args) {
        // write your code here
        EX3 objCustoer1 = new EX3();
        //
        objCustoer1.customerID = 100;
        objCustoer1.customerName = "John";
        objCustoer1.customerAddress = "123 Street";
        objCustoer1.custtomerAge= 30;
        //
        System.out.println("Customer IdentificationNumber:"+objCustoer1.customerID);
        System.out.println("CustomerName:" + objCustoer1.customerName);
        System.out.println("CustomerAddress:" + objCustoer1.customerAddress);
        System.out.println("CustomerAge:" + objCustoer1.custtomerAge);
    }
}
