package com.spyoyo.aws.utilities;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spyoyo.aws.model.StringCharacterCount;

import java.util.Objects;

public class StringProcessor {

    StringProcessor(){}
    public static JsonNode createStringCharacteristicsJson(String source) {
        ObjectMapper objectMapper = new ObjectMapper();
        String validSource = Objects.requireNonNull(source);
        int sourceLength = validSource.length();
        int sourceWhitespaceCount = validSource.split("\\s").length - 1;
        StringCharacterCount stringCharacterCount = new StringCharacterCount(source, sourceLength, sourceWhitespaceCount);
        return objectMapper.valueToTree(stringCharacterCount);
    }
}
