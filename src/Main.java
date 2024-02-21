import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        for dinamically array
        DinamicallyArray dinamicallyArray= new DinamicallyArray();
        dinamicallyArray.autoArray();
        System.out.println();
        System.out.println();
        System.out.println();




        Customer premiumCustomer = new Customer("haha", "Premium");
        Customer goldCustomer = new Customer("yaya", "Gold");
        Customer silverCustomer = new Customer("baba", "Silver");
        Customer normalCustomer = new Customer("nana", "Normal");

        Sale premiumSale = new Sale(premiumCustomer, "2024-02-20");
        Sale goldSale = new Sale(goldCustomer, "2024-02-20");
        Sale silverSale = new Sale(silverCustomer, "2024-02-20");
        Sale normalSale = new Sale(normalCustomer, "2024-02-20");

        premiumSale.setServiceExpence(100);
        premiumSale.setProductExpence(200);

        goldSale.setServiceExpence(100);
        goldSale.setProductExpence(200);

        silverSale.setServiceExpence(100);
        silverSale.setProductExpence(200);

        normalSale.setServiceExpence(100);
        normalSale.setProductExpence(200);

        premiumSale.DisplayInfo();
        goldSale.DisplayInfo();
        silverSale.DisplayInfo();
        normalSale.DisplayInfo();


    }
}