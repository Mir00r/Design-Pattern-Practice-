/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.mir00r.dao;

import observerpattern.mir00r.service.ISubscriber;

/**
 *
 * @author Created by Mir00r
 */
public class User implements ISubscriber {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(String postTitle) {
        System.out.println("Hey " + name
                + " "
                + "Checkout the new post named " + postTitle);
    }

    @Override
    public String getName(String name) {
        this.name = name;
        return name;
    }
}
