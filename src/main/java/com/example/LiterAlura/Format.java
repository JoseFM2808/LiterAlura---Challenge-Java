package com.example.LiterAlura;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Format {
    private Map<String, String> formats;

    public Format() {
    }

    public Map<String, String> getFormats() {
        return formats;
    }

    public void setFormats(Map<String, String> formats) {
        this.formats = formats;
    }

    @Override
    public String toString() {
        return "Format{" +
                "formats=" + formats +
                '}';
    }
}