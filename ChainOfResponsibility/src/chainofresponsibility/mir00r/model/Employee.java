/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility.mir00r.model;

/**
 *
 * @author Created by Mir00r
 */
public class Employee {

    private String name;
    private String gender;
    private int deys;

    /**
     *
     * @param name
     * @param gender
     * @param deys
     */
    public Employee(String name, String gender, int deys) {
        this.name = name;
        this.gender = gender;
        this.deys = deys;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public int getDeys() {
        return deys;
    }

    /**
     *
     * @param deys
     */
    public void setDeys(int deys) {
        this.deys = deys;
    }

}
