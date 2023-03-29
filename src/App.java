import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class App {
	public static void main(String[] args) {
		String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
		HttpClient client = HttpClient.newHttpClient();
		URI endereco = URI.create(url);
	}
}
