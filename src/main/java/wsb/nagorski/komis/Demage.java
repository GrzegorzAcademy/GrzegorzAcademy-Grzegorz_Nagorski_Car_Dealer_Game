package wsb.nagorski.komis;

import java.util.LinkedList;

public enum Demage {
    BREAKS("HAMULCE",10),
    SUSPENSION("ZAWIIESZENIE",20),
    ENGINE("SILNIK",100),
    BODY("KAROSERIA",50),
    GEARBOX("SKRZYNIA BIEGÓW",50),
    NONE("BEZ USZKODZEŃ",0);



    Demage(String demage, Integer value) {
        this.demage = demage;
        this.value = value;
    }

    final String demage;
    final Integer value;


}

