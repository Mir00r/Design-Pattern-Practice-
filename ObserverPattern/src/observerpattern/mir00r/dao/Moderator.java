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
public class Moderator implements ISubscriber {

    private String name;

    public Moderator(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(String postTitle) {
        System.out.println("Hello Mr: " + name
                + " "
                + "A new post named has been posted in the blognyou need to moderate the comments " + postTitle);
    }

    @Override
    public String getName(String name) {
        this.name = name;
        return name;
    }

}
