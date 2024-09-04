import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        // store JSON response
        StringBuilder JSONResponse = new StringBuilder();

        // creating the URL to the endpoint
        URL bankEndpoint = null;
        try {
            bankEndpoint = new URL("https://api.guildwars2.com/v2/account/achievements");
        } catch (MalformedURLException malformedURLException) {
            System.out.println(malformedURLException.getMessage());
        }
        assert bankEndpoint != null;

        // opening a connection to the endpoint
        String APIKey = "Bearer 74135AA2-6CF5-B44E-AE7C-E9C3CF2DA258073196D5-5C9D-4AAF-8152-5DBCAA0A8653";
        HttpsURLConnection connection = null;
        try {
           connection = (HttpsURLConnection) bankEndpoint.openConnection();
           connection.setRequestProperty("Authorization", APIKey);
           connection.setRequestMethod("GET");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        assert connection != null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            for (String responseLine; (responseLine = reader.readLine()) != null;) {
                JSONResponse.append(responseLine);
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        System.out.println(JSONResponse.toString());
    }
}