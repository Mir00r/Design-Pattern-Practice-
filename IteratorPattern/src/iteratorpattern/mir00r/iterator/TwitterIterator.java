/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.mir00r.iterator;

import iteratorpattern.mir00r.enumerator.SocialNetworking;

/**
 *
 * @author Created by Mir00r
 */
public class TwitterIterator implements SocialNetworking {

    private String[] userList;
    private static int MAX_USER = 6;
    private int position = 0;

    public TwitterIterator() {
        userList = new String[MAX_USER];
        userList[0] = "_iLogical";
        userList[1] = "Amit Seal Ami";
        userList[2] = "Crackbrained Sakkhor";
        userList[3] = "Bazlur Rahman Rokon";
        userList[4] = "Sachine Tendulkar";
        userList[5] = "Shane Watson";
    }

    @Override
    public boolean hasNext() {
        return userList.length > position;
    }

    @Override
    public Object next() {
        String element = userList[position];
        return element;
    }

}
