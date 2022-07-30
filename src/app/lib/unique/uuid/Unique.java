package app.lib.unique.uuid;

import java.util.UUID;

public class Unique {
    public String hash(){
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        return randomUUIDString;
    }
}
