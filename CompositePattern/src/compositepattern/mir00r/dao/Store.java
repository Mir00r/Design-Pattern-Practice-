/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern.mir00r.dao;

import compositepattern.mir00r.service.IProfitable;

/**
 *
 * @author Created by Mir00r
 */
public class Store implements IProfitable {

    private int id;
    private int profit;
    private String name;

    public Store(int id, int profit, String name) {
        this.id = id;
        this.profit = profit;
        this.name = name;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public int getId(int Id) {
        this.id = Id;
        return id;
    }

    @Override
    public String getName(String Name) {
        this.name = Name;
        return name;
    }

    @Override
    public void addChild(IProfitable profitable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeChild(IProfitable profitable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
