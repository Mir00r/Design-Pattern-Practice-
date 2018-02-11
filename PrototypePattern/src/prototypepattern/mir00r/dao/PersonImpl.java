/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern.mir00r.dao;

import prototypepattern.mir00r.model.Person;
import prototypepattern.mir00r.service.Prototype;

/**
 *
 * @author Created by Mir00r
 */
public class PersonImpl implements Prototype {

    private String name;
    private String email;

    public PersonImpl(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public Object Clone() {
//        Person person = new Person();
//        person.setName(name);
//        person.setEmail(email);
//        return person;
//    }
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (PersonImpl) super.clone();
    }

}
