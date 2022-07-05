package com.example.sslbackend.training;

import com.example.sslbackend.training.TrainingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TrainingController {

    private final TrainingService training;

    public TrainingController(TrainingService trainingService) {
        this.training = trainingService;
    }

    @GetMapping("/start")
    public ResponseEntity<String> main (){
        return new ResponseEntity<>( training.str(), HttpStatus.OK);
    }


}
