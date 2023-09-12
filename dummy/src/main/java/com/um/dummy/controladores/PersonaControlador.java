package com.um.dummy.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") //El profe lo explica después

@RequestMapping(path = "api/personas")
public class PersonaControlador {
    @GetMapping("subRuta")
    public ResponseEntity<String> holaMundo(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te saludo desde la Api Dummy");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
    @GetMapping("subRutaChau")
    public ResponseEntity<String> chauMundo(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Me despido desde la Api Dummy");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
}
