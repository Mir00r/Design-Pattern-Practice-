/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.mir00r.service;

import java.util.List;

/**
 *
 * @author Created by Mir00r
 */
public interface IObservable {

    public void subscribe(ISubscriber subscriber);

    public void unSubscribe(ISubscriber subscriber);

    public void notifySubscribers(List<ISubscriber> subscribers);
}
