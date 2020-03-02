package Objects;

import java.util.Random;

public enum Role {
    STUDENT,
    SCHOOL_OWNER,
    INSTRUCTOR,
    RACE_ORGANIZER,
    SERVICE,
    SHOP_OWNER;

    public Role getRandomRole(){
        int pick = new Random().nextInt(Role.values().length);
        return Role.values()[pick];
    }
}
