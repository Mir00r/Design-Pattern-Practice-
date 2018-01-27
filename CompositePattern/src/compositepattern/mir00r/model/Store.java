/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern.mir00r.model;

/**
 *
 * @author Created by Mir00r
 */
public class Store {

    private int Id;
    private int profit;
    private String name;

    public Store() {
    }

    /**
     *
     * @param Id
     * @param profit
     * @param name
     */
    public Store(int Id, int profit, String name) {
        this.Id = Id;
        this.profit = profit;
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @param Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     */
    public int getProfit() {
        return profit;
    }

    /**
     *
     * @param profit
     */
    public void setProfit(int profit) {
        this.profit = profit;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
