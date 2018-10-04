package com.chrisyoo;

public class Room {
    private Bathroom bathroom;
    private Chair deskChair;
    private Desk desk;

    public Room(Bathroom bathroom, Chair deskChair, Desk desk) {
        this.bathroom = bathroom;
        this.deskChair = deskChair;
        this.desk = desk;
    }

    public void presentCondition () {
        bathroom.toiletPresent();
        desk.deskStyle();
        chairPart();
    }

    private void chairPart() {
        deskChair.chairMaterial();
    }

}
