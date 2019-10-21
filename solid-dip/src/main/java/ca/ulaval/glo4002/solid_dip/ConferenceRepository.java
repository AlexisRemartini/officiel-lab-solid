package ca.ulaval.glo4002.solid_dip;

import java.util.HashMap;
import java.util.Map;

public interface ConferenceRepository {

    void persist(Conference conference);

    Conference findByName(String name);

    Conference[] findAll();
}
