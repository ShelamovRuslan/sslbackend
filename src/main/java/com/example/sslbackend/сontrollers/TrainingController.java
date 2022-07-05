package com.example.sslbackend.сontrollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TrainingController {

    @GetMapping("/start")
    public ResponseEntity<String> main (){
        return new ResponseEntity<>("ЮХУ У ТЕБЯ ВЫШЛО :)", HttpStatus.OK);
    }
}
