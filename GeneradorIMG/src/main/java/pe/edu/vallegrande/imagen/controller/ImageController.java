package pe.edu.vallegrande.imagen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/generadorIMG")
public class ImageController {

    @Value("${api.endpoint}")
    private String apiEndpoint;

    @Value("${api.key}")
    private String apiKey;

    @PostMapping("/realistic")
    public ResponseEntity<?> generateImage(@RequestBody ImageRequest imageRequest) {
        String inputText = imageRequest.getInput();

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-key", apiKey);
        headers.set("x-rapidapi-host", "ai-text-to-image-generator-api.p.rapidapi.com");
        headers.set("Content-Type", "application/json");

        String requestBody = String.format("{\"inputs\":\"%s\"}", inputText);
        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(apiEndpoint+"realistic", request, String.class);
        return ResponseEntity.ok(response.getBody());
    }


    @PostMapping("/imagen3d")
    public ResponseEntity<?> generateImage3D(@RequestBody ImageRequest imageRequest) {
        String inputText = imageRequest.getInput();

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-key", apiKey);
        headers.set("x-rapidapi-ua", "RapidAPI-Playground");

        headers.set("x-rapidapi-host", "ai-text-to-image-generator-api.p.rapidapi.com");
        headers.set("Content-Type", "application/json");

        String requestBody = String.format("{\"inputs\":\"%s\"}", inputText);
        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(apiEndpoint+"3D", request, String.class);
        return ResponseEntity.ok(response.getBody());
    }
}

class ImageRequest {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
