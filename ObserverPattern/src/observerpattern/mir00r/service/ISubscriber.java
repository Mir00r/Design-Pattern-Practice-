/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.mir00r.service;

/**
 *
 * @author Created by Mir00r
 */
public interface ISubscriber {

    public void getNotification(String postTitle);

    public String getName(String name);
}
