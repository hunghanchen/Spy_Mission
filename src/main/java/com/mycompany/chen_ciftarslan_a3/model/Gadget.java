

package com.mycompany.chen_ciftarslan_a3.model;

import java.io.Serializable;

/**
 * @author Hung-Han,Chen & Ali Cemilcan Ciftarslan
 * Gadget Class with getter & setter for name attribute
 */
public class Gadget implements Serializable{
    
    private String name;

    public Gadget() {
    }

    public Gadget(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
