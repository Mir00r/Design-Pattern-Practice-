/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import compositepattern.mir00r.dao.City;
import compositepattern.mir00r.dao.Division;
import compositepattern.mir00r.dao.Store;
import compositepattern.mir00r.service.IProfitable;
import java.util.Scanner;

/**
 *
 * @author Created by Mir00r
 */
public class CompositePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int tc = s.nextInt();
//
//        IProfitable ip = null;
//        for (int i = 0; i < tc; i++) {
//            int id = s.nextInt();
//            int profit = s.nextInt();
//            String name = s.next();
//            
//            ip = new Store(id, profit, name);
//        }
//        
//        int TC = s.nextInt();
//        int id = s.nextInt();
//        int profit = s.nextInt();
//        String name = s.next();
        int id = 1;
        int profit = 2;
        String name = "Dhanmondi BFC";

        IProfitable store1 = new Store(id, profit, name);

//        int id1 = s.nextInt();
//        int profit1 = s.nextInt();
//        String name1 = s.next();
        int id1 = 2;
        int profit1 = 5;
        String name1 = "Gulshan BFC";

        IProfitable store2 = new Store(id1, profit1, name1);

//        int cId = s.nextInt();
//        String cName = s.next();
        int cId = 10;
        String cName = "Dhaka";
        IProfitable city = new City(cId, cName);

        city = new City();
        city.addChild(store1);
        city.addChild(store2);

//        int dId = s.nextInt();
//        String dName = s.next();
        int dId = 1;
        String dName = "Barishal";

        IProfitable division = new Division(dId, dName);

        division = new Division();
        division.addChild(city);
        int totalProfit = division.getProfit();

        System.out.println("Total Profit of " + division.getName(dName)
                + " "
                + "division is " + totalProfit);
    }

}
