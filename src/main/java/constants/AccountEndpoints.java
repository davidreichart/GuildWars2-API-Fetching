package constants;

import java.net.MalformedURLException;
import java.net.URL;

public enum AccountEndpoints {
    BASE("https://api.guildwars2.com/v2/account"),
    ACHIEVEMENTS("https://api.guildwars2.com/v2/account/achievements"),
    BANK("https://api.guildwars2.com/v2/account/bank"),
    BUILD_STORAGE("https://api.guildwars2.com/v2/account/buildstorage"),
    DAILY_CRAFTING("https://api.guildwars2.com/v2/account/dailycrafting"),
    DUNGEONS("https://api.guildwars2.com/v2/account/dungeons"),
    DYES("https://api.guildwars2.com/v2/account/dyes"),
    EMOTES("https://api.guildwars2.com/v2/account/emotes"),
    FINISHERS("https://api.guildwars2.com/v2/account/finishers"),
    GLIDERS("https://api.guildwars2.com/v2/account/gliders"),
    HOME("https://api.guildwars2.com/v2/account/home"),
    HOME_CATS("https://api.guildwars2.com/v2/account/home/cats"),
    HOME_NODES("https://api.guildwars2.com/v2/account/home/nodes"),
    HOMESTEAD("https://api.guildwars2.com/v2/account/homestead"),
    HOMESTEAD_DECORATIONS("https://api.guildwars2.com/v2/account/homestead/decorations"),
    HOMESTEAD_GLYPHS("https://api.guildwars2.com/v2/account/homestead/glyphs"),
    INVENTORY("https://api.guildwars2.com/v2/account/inventory"),
    JADEBOTS("https://api.guildwars2.com/v2/account/jadebots"),
    LEGENDARY_ARMORY("https://api.guildwars2.com/v2/account/legendaryarmory"),
    LUCK("https://api.guildwars2.com/v2/account/luck"),
    //MAIL("https://api.guildwars2.com/v2/account/mail"),   currently disabled as of 9-5-2024
    MAIL_CARRIERS("https://api.guildwars2.com/v2/account/mailcarriers"),
    MAP_CHESTS("https://api.guildwars2.com/v2/account/mapchests"),
    MASTERIES("https://api.guildwars2.com/v2/account/masteries"),
    MINIS("https://api.guildwars2.com/v2/account/minis"),
    MOUNTS("https://api.guildwars2.com/v2/account/mounts"),
    MOUNT_SKINS("https://api.guildwars2.com/v2/account/mounts/skins"),
    MOUNT_TYPES("https://api.guildwars2.com/v2/account/mounts/types"),
    NOVELTIES("https://api.guildwars2.com/v2/account/novelties"),
    OUTFITS("https://api.guildwars2.com/v2/account/outfits"),
    PROGRESSION("https://api.guildwars2.com/v2/account/progression"),
    PVP_HEROES("https://api.guildwars2.com/v2/account/pvp/heroes"),
    RAIDS("https://api.guildwars2.com/v2/account/raids"),
    RECIPES("https://api.guildwars2.com/v2/account/recipes"),
    SKIFFS("https://api.guildwars2.com/v2/account/skiffs"),
    SKINS("https://api.guildwars2.com/v2/account/skins"),
    TITLES("https://api.guildwars2.com/v2/account/titles"),
    WALLET("https://api.guildwars2.com/v2/account/wallet"),
    WIZARDS_VAULT_DAILY("https://api.guildwars2.com/v2/account/wizardsvault/daily"),
    WIZARDS_VAULT_LISTINGS("https://api.guildwars2.com/v2/account/wizardsvault/listings"),
    WIZARDS_VAULT_SPECIAL("https://api.guildwars2.com/v2/account/wizardsvault/special"),
    WIZARDS_VAULT_WEEKLY("https://api.guildwars2.com/v2/account/wizardsvault/weekly"),
    WORLD_BOSSES("https://api.guildwars2.com/v2/account/worldbosses"),
    WVW("https://api.guildwars2.com/v2/account/wvw");

    private final String endpoint;
    private AccountEndpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Creates and returns a URL object pointing towards the corresponding account endpoint this method is called on.
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
     * Returns a string representation of the corresponding account endpoint URL this method is called on.
     * @return A String representation of this endpoint's full URL.
     */
    @Override
    public String toString() {
        return this.endpoint;
    }
}
