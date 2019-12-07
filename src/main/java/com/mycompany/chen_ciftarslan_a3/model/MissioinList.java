package com.mycompany.chen_ciftarslan_a3.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nancy Chen
 */
public class MissioinList implements Serializable {

    private String agent;
    private ArrayList<Mission> missions;

    public MissioinList() {
        this.agent = "";
        this.missions = new ArrayList<>();
    }

    public MissioinList(String agent, ArrayList<Mission> missions) {
        this.agent = agent;
        this.missions = new ArrayList<>();
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public ArrayList<Mission> getMissions() {
        return missions;
    }

    public void setMissions(ArrayList<Mission> missions) {
        this.missions = missions;
    }

    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

}
