import constants.AccountEndpoints;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

public class Account {
    private String apiKey;

    public Account(String apiKey) {
        if (isValidAPIKey(apiKey)) {
            this.apiKey = apiKey;
        }
    }

    private boolean isValidAPIKey(String apiKey) {
        URL endpoint = AccountEndpoints.BASE.toURL();

        HttpsURLConnection connection = null;
        try {
            connection = (HttpsURLConnection) endpoint.openConnection();
            connection.setRequestProperty("Authorization", apiKey);
            connection.setRequestMethod("GET");
        }
        catch (IOException ioException) {
            System.out.println(ioException);
            return false;
        }

        try {
            switch (connection.getResponseCode()) {
                case 200:
                    return true;
                default:
                    return false;
            }
        }
        catch (IOException ioException) {
            System.out.println(ioException.getMessage());
            return false;
        }

    }

    public String getApiKey() {
        return apiKey;
    }
}
