import constants.AccountEndpoints;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

public final class HttpAgent {
    private HttpAgent() {}

    public static HttpsURLConnection openGetConnection(String apiKey, URL endpointURL) {
        HttpsURLConnection connection = null;
        try {
            connection = (HttpsURLConnection) endpointURL.openConnection();
            connection.setRequestProperty("Authorization", apiKey);
            connection.setRequestMethod("GET");
        }
        catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        return connection;
    }

    public static Object getResource(AccountEndpoints endpoint, String apiKey) {
        URL endpointURL = endpoint.toURL();
        HttpsURLConnection connection = openGetConnection(apiKey, endpointURL);
    }
}
