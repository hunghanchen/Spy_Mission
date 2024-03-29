package com.mycompany.chen_ciftarslan_a3.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Hung-Han,Chen & Ali Cemilcan Ciftarslan We are using ArrayList to
 * keep missions.
 */
public class MissionList implements Serializable {

    private String agent;
    private ArrayList<Mission> missions;

    public MissionList() {
        this.agent = "";
        this.missions = new ArrayList<>();
    }

    public MissionList(String agent, ArrayList<Mission> missions) {
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
