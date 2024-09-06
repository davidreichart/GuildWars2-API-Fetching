package constants;

import java.net.MalformedURLException;
import java.net.URL;

public enum CharacterEndpoints {
    ADVENTURERS("https://api.guildwars2.com/v2/adventurers"),
    ADVENTURERS_LEADERBOARDS("https://api.guildwars2.com/v2/adventurers/:id/leaderboards"),
    ADVENTURERS_LEADERBOARDS_BY_REGION("https://api.guildwars2.com/v2/adventurers/:id/leaderboards/:board/:region"),
    CHARACTERS("https://api.guildwars2.com/v2/characters"),
    CHARACTER_BACKSTORY("https://api.guildwars2.com/v2/characters/:id/backstory"),
    CHARACTER_BUILD_TABS("https://api.guildwars2.com/v2/characters/:id/buildtabs"),
    CHARACTER_BUILD_TABS_ACTIVE("https://api.guildwars2.com/v2/characters/:id/buildtabs/active"),
    CHARACTER_CORE("https://api.guildwars2.com/v2/characters/:id/core"),
    CHARACTER_CRAFTING("https://api.guildwars2.com/v2/characters/:id/crafting"),
    CHARACTER_DUNGEONS("https://api.guildwars2.com/v2/characters/:id/dungeons"),
    CHARACTER_EQUIPMENT("https://api.guildwars2.com/v2/characters/:id/equipment"),
    CHARACTER_EQUIPMENT_TABS("https://api.guildwars2.com/v2/characters/:id/equipmenttabs"),
    CHARACTER_EQUIPMENT_TABS_ACTIVE("https://api.guildwars2.com/v2/characters/:id/equipmenttabs/active"),
    CHARACTER_HERO_POINTS("https://api.guildwars2.com/v2/characters/:id/heropoints"),
    CHARACTER_INVENTORY("https://api.guildwars2.com/v2/characters/:id/inventory"),
    CHARACTER_QUESTS("https://api.guildwars2.com/v2/characters/:id/quests"),
    CHARACTER_RECIPES("https://api.guildwars2.com/v2/characters/:id/recipes"),
    CHARACTER_SAB("https://api.guildwars2.com/v2/characters/:id/sab"),
    CHARACTER_SKILLS("https://api.guildwars2.com/v2/characters/:id/skills"),
    CHARACTER_SPECIALIZATIONS("https://api.guildwars2.com/v2/characters/:id/specializations"),
    CHARACTER_TRAINING("https://api.guildwars2.com/v2/characters/:id/training");

    private final String endpoint;
    private CharacterEndpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Creates and returns a URL object pointing towards the corresponding character endpoint this method is called on.
     * @return A URL object pointing towards an API endpoint.
     */
    public URL toURL() {
        URL endpointURL = null;
        try {
            endpointURL = new URL(this.endpoint);
        }
        catch (MalformedURLException malformedURLException) {
            System.out.println("The defined URL for this endpoint is incorrect or inactive: " + this.endpoint);
        }
        //todo: if the exception occurs this will return null, deal with that somehow?
        return endpointURL;
    }

    /**
     * Returns a string representation of the corresponding character endpoint URL this method is called on.
     * @return A String representation of this endpoint's full URL.
     */
    @Override
    public String toString() {
        return this.endpoint;
    }
}
