package com.kanopi.swatch;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Authored by dushan.p@viewqwest.com on 30/11/21.
 * http://dushan.lk
 */
@RestController
public class SwatchApi {

    private static final SwatchGenerator SWATCH_GENERATOR = new SwatchGenerator();

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/swatch")
    public List<Color> generate() throws NoColorSpacesFoundException {
        return SWATCH_GENERATOR.generate();
    }
}
