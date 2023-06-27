package main.java.Generics.Game;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;//team name
    }
    public  void addNewParticipant(Participant participant){
        participants.add(participant);
        System.out.println("In team " + name + " new participant was added: " + participant.getName());
    }
}
