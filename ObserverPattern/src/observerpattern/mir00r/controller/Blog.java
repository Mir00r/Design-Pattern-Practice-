/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.mir00r.controller;

import java.util.ArrayList;
import java.util.List;
import observerpattern.mir00r.service.IObservable;
import observerpattern.mir00r.service.ISubscriber;

/**
 *
 * @author Created by Mir00r
 */
public class Blog implements IObservable {

    private String postTitle;
    private List<ISubscriber> iSubscriberList;

    public Blog() {
        iSubscriberList = new ArrayList<ISubscriber>();
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        if (this.postTitle != postTitle) {
            this.postTitle = postTitle;
        }
//        notifySubscribers();
        notifySubscribers(iSubscriberList);
    }

    /**
     * add for the notify feature
     *
     * @param iSubscriber
     */
    @Override
    public void subscribe(ISubscriber iSubscriber) {
        iSubscriberList.add(iSubscriber);
    }

    /**
     * remove from this feature
     *
     * @param subscriber
     */
    @Override
    public void unSubscribe(ISubscriber subscriber) {
        iSubscriberList.remove(subscriber);
    }

    /**
     * Notify to all user if the subject status will change then all user will
     * be notified
     *
     * @param subscribers
     */
    @Override
    public void notifySubscribers(List<ISubscriber> subscribers) {
        for (ISubscriber subscriber : subscribers) {
            subscriber.getNotification(postTitle);
        }

//        ISubscriber observer = new User("Jalil");
//        observer.getNotification(postTitle);
//
//        observer = new Moderator("Motu");
//        observer.getNotification(postTitle);
    }

}
