package com.company;

import com.company.entities.Accident;
import com.company.entities.Crime;
import com.company.entities.Injury;

public class Ambulance extends BaseEmergencyCallHandler {
    @Override
    public void handle(Accident accident) {
        if (canHandle(accident)) {
            System.out.println("saving lifes");
        }
        super.handle(accident);
    }

    private boolean canHandle(Accident accident) {
        return accident instanceof Injury;
    }
}
