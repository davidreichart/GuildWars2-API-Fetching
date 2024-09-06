package constants;

import java.net.MalformedURLException;
import java.net.URL;

public enum GlobalEndpoints {
    BASE("https://api.guildwars2.com/v2/"),
    ACHIEVEMENTS("https://api.guildwars2.com/v2/achievements"),
    ACHIEVEMENTS_CATEGORIES("https://api.guildwars2.com/v2/achievements/categories"),
    ACHIEVEMENTS_DAILY("https://api.guildwars2.com/v2/achievements/daily"),
    ACHIEVEMENTS_DAILY_TOMORROW("https://api.guildwars2.com/v2/daily/tomorrow"),
    ACHIEVEMENTS_GROUPS("https://api.guildwars2.com/v2/achievements/groups"),
    BACKSTORY_ANSWERS("https://api.guildwars2.com/v2/backstory/answers"),
    BACKSTORY_QUESTIONS("https://api.guildwars2.com/v2/backstory/questions"),
    BUILD("https://api.guildwars2.com/v2/build"),
    COLORS("https://api.guildwars2.com/v2/colors"),
    COMMERCE_DELIVERY("https://api.guildwars2.com/v2/commerce/delivery"),
    COMMERCE_EXCHANGE("https://api.guildwars2.com/v2/commerce/exchange"),
    COMMERCE_LISTINGS("https://api.guildwars2.com/v2/commerce/listings"),
    COMMERCE_PRICES("https://api.guildwars2.com/v2/commerce/prices"),
    COMMERCE_TRANSACTIONS("https://api.guildwars2.com/v2/commerce/transactions"),
    CONTINENTS("https://api.guildwars2.com/v2/continents"),
    CREATE_SUBTOKEN("https://api.guildwars2.com/v2/createsubtoken"),
    CURRENCIES("https://api.guildwars2.com/v2/currencies"),
    DAILY_CRAFTING("https://api.guildwars2.com/v2/dailycrafting"),
    DUNGEONS("https://api.guildwars2.com/v2/dungeons"),
    EMBLEMS("https://api.guildwars2.com/v2/emblems"),
    EMOTES("https://api.guildwars2.com/v2/emotes"),
    EVENTS("https://api.guildwars2.com/v2/events"),
    EVENTS_STATE("https://api.guildwars2.com/v2/events-state"),
    FILES("https://api.guildwars2.com/v2/files"),
    FINISHERS("https://api.guildwars2.com/v2/finishers"),
    GEMSTORE_CATALOG("https://api.guildwars2.com/v2/gemstore/catalog"),
    GLIDERS("https://api.guildwars2.com/v2/gliders"),
    GUILD("https://api.guildwars2.com/v2/guild/:id"),
    GUILD_LOG("https://api.guildwars2.com/v2/guild/:id/log"),
    GUILD_MEMBERS("https://api.guildwars2.com/v2/guild/:id/members"),
    GUILD_RANKS("https://api.guildwars2.com/v2/guild/:id/ranks"),
    GUILD_STASH("https://api.guildwars2.com/v2/guild/:id/stash"),
    GUILD_STORAGE("https://api.guildwars2.com/v2/guild/:id/storage"),
    GUILD_TEAMS("https://api.guildwars2.com/v2/guild/:id/teams"),
    GUILD_TREASURY("https://api.guildwars2.com/v2/guild/:id/treasury"),
    GUILD_UPGRADES("https://api.guildwars2.com/v2/guild/:id/upgrades"),
    GUILD_PERMISSIONS("https://api.guildwars2.com/v2/guild/permissions"),
    GUILD_SEARCH("https://api.guildwars2.com/v2/guild/search"),
    GUILD_UPGRADES_GLOBAL("https://api.guildwars2.com/v2/guild/upgrades"),
    HOME("https://api.guildwars2.com/v2/home"),
    HOME_CATS("https://api.guildwars2.com/v2/home/cats"),
    HOME_NODES("https://api.guildwars2.com/v2/home/nodes"),
    HOMESTEAD("https://api.guildwars2.com/v2/homestead"),
    HOMESTEAD_DECORATIONS("https://api.guildwars2.com/v2/homestead/decorations"),
    HOMESTEAD_DECORATIONS_CATEGORIES("https://api.guildwars2.com/v2/homestead/decorations/categories"),
    HOMESTEAD_DECORATIONS_CATEGORIES_BY_ID("https://api.guildwars2.com/v2/homestead/decorations/categories/:id"),
    HOMESTEAD_GLYPHS("https://api.guildwars2.com/v2/homestead/glyphs"),
    ITEMS("https://api.guildwars2.com/v2/items"),
    ITEM_STATS("https://api.guildwars2.com/v2/itemstats"),
    JADEBOTS("https://api.guildwars2.com/v2/jadebots"),
    LEGENDARY_ARMORY("https://api.guildwars2.com/v2/legendaryarmory"),
    LEGENDS("https://api.guildwars2.com/v2/legends"),
    MAIL_CARRIERS("https://api.guildwars2.com/v2/mailcarriers"),
    MAP_CHESTS("https://api.guildwars2.com/v2/mapchests"),
    MAPS("https://api.guildwars2.com/v2/maps"),
    MASTERIES("https://api.guildwars2.com/v2/masteries"),
    MATERIALS("https://api.guildwars2.com/v2/materials"),
    MINIS("https://api.guildwars2.com/v2/minis"),
    MOUNTS("https://api.guildwars2.com/v2/mounts"),
    MOUNT_SKINS("https://api.guildwars2.com/v2/mounts/skins"),
    MOUNT_TYPES("https://api.guildwars2.com/v2/mounts/types"),
    NOVELTIES("https://api.guildwars2.com/v2/novelties"),
    OUTFITS("https://api.guildwars2.com/v2/outfits"),
    PETS("https://api.guildwars2.com/v2/pets"),
    PROFESSIONS("https://api.guildwars2.com/v2/professions"),
    PVP("https://api.guildwars2.com/v2/pvp"),
    PVP_AMULETS("https://api.guildwars2.com/v2/pvp/amulets"),
    PVP_GAMES("https://api.guildwars2.com/v2/pvp/games"),
    PVP_HEROES("https://api.guildwars2.com/v2/pvp/heroes"),
    PVP_RANKS("https://api.guildwars2.com/v2/pvp/ranks"),
    PVP_REWARD_TRACKS("https://api.guildwars2.com/v2/pvp/rewardtracks"),
    PVP_RUNES("https://api.guildwars2.com/v2/pvp/runes"),
    PVP_SEASONS("https://api.guildwars2.com/v2/pvp/seasons"),
    PVP_SEASON_LEADERBOARDS_BY_ID("https://api.guildwars2.com/v2/pvp/seasons/:id/leaderboards"),
    PVP_SEASON_LEADERBOARDS_BY_ID_AND_REGION("https://api.guildwars2.com/v2/pvp/seasons/:id/leaderboards/:board/:region"),
    PVP_SIGILS("https://api.guildwars2.com/v2/pvp/sigils"),
    PVP_STANDINGS("https://api.guildwars2.com/v2/pvp/standings"),
    PVP_STATS("https://api.guildwars2.com/v2/pvp/stats"),
    QUAGGANS("https://api.guildwars2.com/v2/quaggans"),
    QUESTS("https://api.guildwars2.com/v2/quests"),
    RACES("https://api.guildwars2.com/v2/races"),
    RAIDS("https://api.guildwars2.com/v2/raids"),
    RECIPES("https://api.guildwars2.com/v2/recipes"),
    RECIPES_SEARCH("https://api.guildwars2.com/v2/recipes/search"),
    SKIFFS("https://api.guildwars2.com/v2/skiffs"),
    SKILLS("https://api.guildwars2.com/v2/skills"),
    SKINS("https://api.guildwars2.com/v2/skins"),
    SPECIALIZATIONS("https://api.guildwars2.com/v2/specializations"),
    STORIES("https://api.guildwars2.com/v2/stories"),
    STORY_SEASONS("https://api.guildwars2.com/v2/stories/seasons"),
    TITLES("https://api.guildwars2.com/v2/titles"),
    TOKEN_INFO("https://api.guildwars2.com/v2/tokeninfo"),
    TRAITS("https://api.guildwars2.com/v2/traits"),
    VENDORS("https://api.guildwars2.com/v2/vendors"),
    WIZARDS_VAULT_LISTINGS("https://api.guildwars2.com/v2/wizardsvault/listings"),
    WIZARDS_VAULT_OBJECTIVES("https://api.guildwars2.com/v2/wizardsvault/objectives"),
    WORLD_BOSSES("https://api.guildwars2.com/v2/worldbosses"),
    WORLDS("https://api.guildwars2.com/v2/worlds"),
    WVW_ABILITIES("https://api.guildwars2.com/v2/wvw/abilities"),
    WVW_GUILDS("https://api.guildwars2.com/v2/wvw/guilds"),
    WVW_GUILDS_BY_REGION("https://api.guildwars2.com/v2/wvw/guilds/:region"),
    WVW_MATCHES("https://api.guildwars2.com/v2/wvw/matches"),
    WVW_MATCHES_OVERVIEW("https://api.guildwars2.com/v2/wvw/matches/overview"),
    WVW_MATCHES_SCORES("https://api.guildwars2.com/v2/wvw/matches/scores"),
    WVW_MATCHES_STATS("https://api.guildwars2.com/v2/wvw/matches/stats"),
    WVW_MATCHES_STATS_ID_GUILD_ID("https://api.guildwars2.com/v2/wvw/matches/stats/:id/guilds/:guild_id"),
    WVW_MATCHES_STATS_ID_TEAMS_TEAM_TOP_KDR("https://api.guildwars2.com/v2/wvw/matches/stats/:id/teams/:team/top/kdr"),
    WVW_MATCHES_STATS_ID_TEAMS_TEAM_TOP_KILLS("https://api.guildwars2.com/v2/wvw/matches/stats/:id/teams/:team/top/kills"),
    WVW_OBJECTIVES("https://api.guildwars2.com/v2/wvw/objectives"),
    WVW_RANKS("https://api.guildwars2.com/v2/wvw/ranks"),
    WVW_REWARD_TRACKS("https://api.guildwars2.com/v2/wvw/rewardtracks"),
    WVW_TIMERS("https://api.guildwars2.com/v2/wvw/timers"),
    WVW_TIMERS_LOCKOUT("https://api.guildwars2.com/v2/wvw/timers/lockout"),
    WVW_TIMERS_TEAM_ASSIGNMENT("https://api.guildwars2.com/v2/wvw/teamAssignment"),
    WVW_UPGRADES("https://api.guildwars2.com/v2/wvw/upgrades");

    private final String endpoint;
    private GlobalEndpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Creates and returns a URL object pointing towards the corresponding global endpoint this method is called on.
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
     * Returns a string representation of the corresponding global endpoint URL this method is called on.
     * @return A String representation of this endpoint's full URL.
     */
    @Override
    public String toString() {
        return this.endpoint;
    }
}