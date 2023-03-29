import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
	public static void main(String[] args) throws Exception {
		String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
		HttpClient client = HttpClient.newHttpClient();
		URI endereco = URI.create(url);
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		JsonParser parser = new JsonParser();
	}
}