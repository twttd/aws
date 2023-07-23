package com.spyoyo.aws.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spyoyo.aws.utilities.StringProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StringProcessorService {

    public ResponseEntity<String> stringCharacteristics(String source) throws IOException {
        JsonNode jsonNode;
        String jsonString;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            jsonNode = StringProcessor.createStringCharacteristicsJson(source);
            jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
        } catch (JsonProcessingException e) {
            throw new IOException(e);
        }
        return new ResponseEntity<>(jsonString, HttpStatus.OK);
    }
}
