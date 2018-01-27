/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern.mir00r.service;

/**
 *
 * @author Created by Mir00r
 */
public interface IProfitable {

    public int getProfit();

    public int getId(int Id);

    public String getName(String name);

    public void addChild(IProfitable profitable);

    public void removeChild(IProfitable profitable);
}
