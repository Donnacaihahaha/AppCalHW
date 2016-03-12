package com.example.appple.appcalhw;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.DaoGenerator;

/**
 * Created by appple on 3/11/16.
 */
public class DaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.example.appple.appcalhw"); //Scheme for GreenDAO ORM
        createDB(schema);
        new DaoGenerator().generateAll(schema, "./app/src/main/java/");
    }

    private static void createDB(Schema schema) {

        // Add event
        Entity events = schema.addEntity("Event");
        events.addIdProperty();

        // Add the event properties
        events.addStringProperty("eventName");
        events.addDateProperty("date");
    }

}
