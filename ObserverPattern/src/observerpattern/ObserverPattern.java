/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import observerpattern.mir00r.controller.Blog;
import observerpattern.mir00r.dao.Moderator;
import observerpattern.mir00r.dao.User;
import observerpattern.mir00r.service.ISubscriber;

/**
 *
 * @author Created by Mir00r
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blog blog = new Blog();

        ISubscriber moderator = new Moderator("Motu");
        ISubscriber user = new User("Jalil");

        blog.subscribe(moderator);
        blog.subscribe(user);

        blog.setPostTitle("ObserverPattern");

        blog.unSubscribe(moderator);
        blog.setPostTitle("Singleton");
    }

}
