package com.company;

import com.company.entities.Accident;

public abstract class BaseEmergencyCallHandler implements EmergencyCallHandler {

    protected BaseEmergencyCallHandler nextHandler;

    public void setNextHandler(BaseEmergencyCallHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Accident accident) {
        if (nextHandler != null) {
            nextHandler.handle(accident);
        }
    }
}
