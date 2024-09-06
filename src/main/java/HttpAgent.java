import com.google.gson.Gson;
import constants.AccountEndpoints;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.*;

public final class HttpAgent {
    private HttpAgent() {}

    public static String getJsonResponse(AccountEndpoints endpoint, String apiKey) throws ExecutionException, InterruptedException, TimeoutException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint.toString()))
                .GET()
                .header("Authorization", apiKey)
                .build();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        String jsonResponse = response.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);
        return jsonResponse;
    }
}
