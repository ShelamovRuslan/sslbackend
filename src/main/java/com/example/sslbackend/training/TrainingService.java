package com.example.sslbackend.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    public Cup cup () {
        return new Cup(1L, "Айс Латте");
    }
}
