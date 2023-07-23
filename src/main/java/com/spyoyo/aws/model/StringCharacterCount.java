package com.spyoyo.aws.model;

import lombok.Getter;

@Getter
public class StringCharacterCount{

    String source;
    int sourceLength;
    int sourceWhitespaceCount;

    public StringCharacterCount(String source, int sourceLength, int sourceWhitespaceCount) {
        this.source = source;
        this.sourceLength = sourceLength;
        this.sourceWhitespaceCount = sourceWhitespaceCount;
    }
}
