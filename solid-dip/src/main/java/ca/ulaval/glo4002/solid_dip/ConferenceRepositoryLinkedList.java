package ca.ulaval.glo4002.solid_dip;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ConferenceRepositoryLinkedList implements ConferenceRepository {

    public LinkedList<Conference> conferences = new LinkedList<>();

    public void persist(Conference conference) {
        conferences.add(conference);
    }

    public Conference findByName(String name) {
        for (Conference conference: conferences) {
            if(name.equals(conference.name)){
                return conference;
            }
        }
        return null;
    }

    public Conference[] findAll() {
        return conferences.toArray(new Conference[conferences.size()]);
    }

}
