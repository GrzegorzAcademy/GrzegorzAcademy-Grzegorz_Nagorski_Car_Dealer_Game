package wsb.nagorski.komis;

import java.util.LinkedList;

public enum Demage {
    BREAKS("HAMULCE",10),
    SUSPENSION("ZAWIIESZENIE",20),
    ENGINE("SILNIK",100),
    BODY("KAROSERIA",50),
    GEARBOX("SKRZYNIA BIEGÓW",50),
    NONE("BEZ USZKODZEŃ",0);


//        demageList.add(new Demage("breaks", 10));
//        damageList.add(new Demage("suspension", 20));
//        demageList.add(new Demage("engine", 100));
//        demageList.add(new Demage("body", 50));
//        demageList.add(new Demage("gearbox", 50));


    Demage(String demage, Integer value) {
        this.demage = demage;
        this.value = value;
    }

    final String demage;
    final Integer value;


}

