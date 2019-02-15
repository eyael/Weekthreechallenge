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


