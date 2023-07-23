package com.spyoyo.aws.controllers;

import com.spyoyo.aws.exceptions.StringProcessorException;
import com.spyoyo.aws.services.StringProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequestMapping("/process/string")
@RestController
public class StringProcessorController {

    @Autowired
    private StringProcessorService stringProcessorService;

    @PostMapping("/characteristics")
    ResponseEntity<String> stringCharacteristics(@RequestBody String source){

        try {
            return stringProcessorService.stringCharacteristics(source);
        } catch (IOException e) {
            throw new StringProcessorException("Failed to process source string", e);
        }
    }
}
