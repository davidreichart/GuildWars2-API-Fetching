import java.net.MalformedURLException;
import java.net.URL;

public enum AccountEndpoints {
    BASE("https://api.guildwars2.com/v2/account"),
    ACHIEVEMENTS("https://api.guildwars2.com/v2/account/achievements"),

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
