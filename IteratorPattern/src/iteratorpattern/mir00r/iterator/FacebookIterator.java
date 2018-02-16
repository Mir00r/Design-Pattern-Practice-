/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.mir00r.iterator;

import iteratorpattern.mir00r.enumerator.SocialNetworking;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Created by Mir00r
 */
public class FacebookIterator implements SocialNetworking {

    private List<String> userList;
    private int position = 0;

    public FacebookIterator() {
        userList = new ArrayList<String>();
        userList.add("Model Arif Khan");
        userList.add("Model Hero Alom");
        userList.add("Model Akkel Mia");
        userList.add("Model Bekkel Mia");
        userList.add("Model Rusho Khan");
        userList.add("Model Asif Khan");
    }

    @Override
    public boolean hasNext() {
        return userList.size() > position;
    }

    @Override
    public Object next() {
        String element = userList.get(position);
        return element;
    }

}
