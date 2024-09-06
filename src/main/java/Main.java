import constants.AccountEndpoints;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Bearer 74135AA2-6CF5-B44E-AE7C-E9C3CF2DA258073196D5-5C9D-4AAF-8152-5DBCAA0A8653");
        try {
            System.out.println(HttpAgent.getJsonResponse(AccountEndpoints.ACHIEVEMENTS, account.getApiKey()));
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}