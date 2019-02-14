package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //InvoicecItem myobj = new InvoicecItem();
        //String user = "";

        ArrayList<InvoicecItem> item = new ArrayList<>();
        item.add(new InvoicecItem("salad","8.50","1","true/false"));
        item.add(new InvoicecItem("burger","9.95","1","true/false"));
        item.add(new InvoicecItem("cola","3.45","1","true/false"));
        item.add(new InvoicecItem("honeybun","9.95","1","true/false"));



        System.out.println("Customer name: ");
        String customername = sc.nextLine();

        System.out.println("Address: ");
        String address = sc.nextLine();

        System.out.println("Date: ");
        String date = sc.nextLine();

        System.out.println("Account number: ");
        String accountnumber = sc.nextLine();

      //  item.add(new InvoicecItem(customername, address,date, accountnumber));
      //  System.out.println("Add another item");
       /// user=sc.nextLine();

        for (InvoicecItem  : item) {
        System.out.println("Enter your name:"+InvoicecItem.);






        double taxRateVA = 0.06;
        double tipRateDC = 0.053;
        double tipRateMD = 0.0575;
        double tipRateOs = 0.05;

