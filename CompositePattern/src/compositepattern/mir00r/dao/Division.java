/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern.mir00r.dao;

import compositepattern.mir00r.service.IProfitable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Created by Mir00r
 */
public class Division implements IProfitable {

    private int id;
    private String name;
    private List<IProfitable> cityList;

    public Division() {
        cityList = new ArrayList<IProfitable>();
    }

    public Division(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getProfit() {
        int totalProfit = 0;
        for (IProfitable city : cityList) {
            totalProfit += city.getProfit();
        }
        return totalProfit;
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
        if (profitable instanceof City) {
            cityList.add(profitable);
        }
    }

    @Override
    public void removeChild(IProfitable profitable) {
        if (profitable instanceof City) {
            cityList.remove(profitable);
        }
    }
}
