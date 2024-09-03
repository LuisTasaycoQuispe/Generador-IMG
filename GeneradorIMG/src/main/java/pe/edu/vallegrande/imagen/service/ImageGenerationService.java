package pe.edu.vallegrande.imagen.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImageGenerationService {

    @Value("${api.endpoint}")
    private String apiEndpoint;

    @Value("${api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public String generateImage(String inputText) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("x-rapidapi-key", apiKey);
        headers.set("x-rapidapi-ua", "RapidAPI-Playground");

        headers.set("x-rapidapi-host", "ai-text-to-image-generator-api.p.rapidapi.com");

        String requestBody = "{\"inputs\":\"" + inputText + "\"}";

        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.exchange(apiEndpoint+"realistic", HttpMethod.POST, requestEntity, String.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            String jsonResponse = response.getBody();
            return jsonResponse; 
        } else {
            throw new RuntimeException("Error al generar la Imagen   :( " + response.getStatusCode());
        }
    }
    public String generateImage3D(String inputText) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("x-rapidapi-key", apiKey);
        headers.set("x-rapidapi-ua", "RapidAPI-Playground");

        headers.set("x-rapidapi-host", "ai-text-to-image-generator-api.p.rapidapi.com");

        String requestBody = "{\"inputs\":\"" + inputText + "\"}";

        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.exchange(apiEndpoint+"3D", HttpMethod.POST, requestEntity, String.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            String jsonResponse = response.getBody();
            return jsonResponse; 
        } else {
            throw new RuntimeException("Error al generar la Imagen   :( " + response.getStatusCode());
        }
    }
}