package com.mycompany.chen_ciftarslan_a3.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hung-Han,Chen & Ali Cemilcan Ciftarslan Using the Gadget ArrayList to
 * keep all gadgets
 */
public class Mission implements Serializable {

    private String name;
    private ArrayList<Gadget> gadgets;

    public Mission() {
    }

    public Mission(String name, ArrayList<Gadget> gadgets) {
        this.name = name;
        this.gadgets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Gadget> getGadgets() {
        return gadgets;
    }

    public void setGadgets(ArrayList<Gadget> gadgets) {
        this.gadgets = gadgets;
    }

}
