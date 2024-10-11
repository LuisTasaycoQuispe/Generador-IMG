package pe.edu.vallegrande.imagen.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pe.edu.vallegrande.imagen.service.ImageGenerationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/generadorIMG")
public class ImageController {

    private static final Logger logger = LoggerFactory.getLogger(ImageController.class); // Declaración del logger

    private final ImageGenerationService imageGenerationService;

    public ImageController(ImageGenerationService imageGenerationService) {
        this.imageGenerationService = imageGenerationService;
    }

    @PostMapping("/imagen3d")
    public ResponseEntity<?> generateImage3D(@Valid @RequestBody ImageRequest imageRequest) {
        try {
            logger.info("Generando una imagen 3D con la descripcion: {}", imageRequest.getInput());

            String response = imageGenerationService.generateImage3D(imageRequest.getInput());

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            logger.error("Error al generar la imagen 3D : {}", e.getMessage()); 
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error generating 3D image: " + e.getMessage());
        }
    }
}

class ImageRequest {
    @NotEmpty(message = "Input cannot be empty")
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
