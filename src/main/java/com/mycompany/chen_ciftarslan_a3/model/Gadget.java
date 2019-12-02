

package com.mycompany.chen_ciftarslan_a3.model;

import java.io.Serializable;

/**
 *
 * @author Nancy Chen
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
