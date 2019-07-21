package com.badlogic.gdx.controllers;

public class MfiMapping extends ControllerMapping {
    private static MfiMapping instance;

    MfiMapping() {
        super(0, 1, 2, 3,
                0, 1, 2, 3, 8, 9,
                4, 6, 5, 7, UNDEFINED, UNDEFINED);
    }

    static MfiMapping getInstance() {
        if (instance == null)
            instance = new MfiMapping();

        return instance;
    }
}
