package main.java.Generics.Game;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Participant participant){
        participants.add(participant);
        System.out.println("Command team: " + name + "added new participant: " + participant.getName());
    }

    public void playWith(Team team){
        
    }

    public static void main(String[] args) {

    }

}
