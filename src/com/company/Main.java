package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customer myobj = new Customer();
        String user = "";
      String addanotheritem ="";
        int quan = 0;
        double taxMD = 0.06;
        double taxDC = 0.053;
        double taxVA = 0.0575;
        double taxOT = 0.05;

        //boolean= false;

        ArrayList<Customer> item = new ArrayList<>();



        do {
            System.out.println("Enter your name: ");
            String customername = sc.nextLine();

            System.out.println("Enter your Address: ");
            String address = sc.nextLine();

            System.out.println("Enter the Date: ");
            String date = sc.nextLine();

            System.out.println("Enter your Account number: ");
            String accountnumber = sc.nextLine();

            System.out.println("Enter item name");
            String Name = sc.nextLine();

            System.out.println("price");
            double price = sc.nextDouble();

            System.out.println("quantity");
            int quantity = sc.nextInt();
            //While(y){

            System.out.println("is it taxable");
            boolean taxable = sc.nextBoolean();

            item.add(new Customer());
            System.out.println("Add another item");
            addanotheritem=sc.nextLine();

        }while(!addanotheritem.equalsIgnoreCase("no"));

        for (Customer address :item) {
            System.out.println("customername"+ address.getCustomername()+"address"+address.getAddress());


       /* if (user.equalsIgnoreCase("true")) {
            if (user.equalsIgnoreCase("taxMD"))
                System.out.println(price * taxMD);

                //} else
                //   System.out.println("thank you");








    /*static ArrayList<String> customername=new ArrayList<>();

    static ArrayList<String> address=new ArrayList<>();

    static ArrayList<String> date=new ArrayList<>();

    static ArrayList<String> accountNumber=new ArrayList<>();

    static ArrayList<String> itemName=new ArrayList<>();

    static ArrayList<Double> price=new ArrayList<>();

    static ArrayList<Integer> quantity=new ArrayList<>();

    static ArrayList<Boolean>taxiable=new ArrayList<>();

    static ArrayList<String> state=new ArrayList<>();

    public Customer() {*/










        /*double taxRateVA = 0.06;
        double tipRateDC = 0.053;
        double tipRateMD = 0.0575;
        double tipRateOs = 0.05;*/
            }
        }
    }






































import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String streetAddress;
    static int zipcode;
    static String state;
    static address ad;
    static Customer cu;
    static Double cost;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customer myobj = new Customer();
        String user = "";
        String addanotheritem ="";
        int quan = 0;
        double taxMD = 0.06;
        double taxDC = 0.053;
        double taxVA = 0.0575;
        double taxOT = 0.05;


        ArrayList<Customer> item = new ArrayList<>();
        ArrayList<address>  item2=new ArrayList<>();


        do {
            System.out.println("Enter your name: ");
            String customername = sc.nextLine();

            System.out.println("Enter your Street Address: ");
            streetAddress = sc.nextLine();

            System.out.println("Enter your zipcode: ");
            zipcode = sc.nextInt();

            System.out.println("Enter your State: ");
            state = sc.next();


            System.out.println("Enter the Date: ");
            String date = sc.next();

            System.out.println("Enter your Account number: ");
            String accountnumber = sc.next();

            System.out.println("Enter item name");
            String Name = sc.next();

            System.out.println("price");
            double price = sc.nextDouble();

            System.out.println("quantity");
            int quantity = sc.nextInt();

            System.out.println("is it taxable(true|false)");
            boolean taxable = sc.nextBoolean();


            ad=new address(streetAddress,zipcode,state);
            item2.add(ad);
            item.add(new Customer(customername,ad,date,accountnumber,Name,price,quantity,taxable));
            System.out.println("Add another item?(type any key to continue | type 'no' to exit)");
            addanotheritem=sc.next();

        }while(!addanotheritem.equalsIgnoreCase("no"));

        for (Customer address :item) {
            System.out.println("Customer name: "+ address.getCustomername());
            System.out.print("Address: "+address.getAddress().getStreet()+","+address.getAddress().getState()+","+address.getAddress().getZipcode()+"\n");
            System.out.println("Date: "+address.getDate());
            System.out.println("Account Number: "+address.getAccountnumber());
            if(address.getAddress().getState().equalsIgnoreCase("MD")) {
                cost = address.getQuantity() * address.getPrice()*0.06;
            }
            else if(address.getAddress().getState().equalsIgnoreCase("DC")){
                cost = address.getQuantity() * address.getPrice()*0.053;
            }
            else if(address.getAddress().getState().equalsIgnoreCase("VA")){
                cost = address.getQuantity() * address.getPrice()*0.0575;
            }
            else {
                cost = address.getQuantity() * address.getPrice()*0.05;
            }
            System.out.print("Item Name         Quantity         Price       Cost          Taxable\n");
            System.out.print("--------------------------------------------------------------------\n");
            System.out.print(address.getName()+"               "+address.getQuantity()+"                "+address.getPrice()+"           "+cost+"          "+address.isTaxable()+"\n");
        }
    }
}






