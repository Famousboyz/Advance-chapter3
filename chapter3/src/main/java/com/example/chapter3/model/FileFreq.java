package com.example.chapter3.model;

public class FileFreq {
    private final String name;
    private final String path;
    private final Integer freq;

    public FileFreq(String name, String path, Integer freq) {
        this.name = name;
        this.path = path;
        this.freq = freq;
    }

    @Override
    public String toString() {
        return String.format("{%s:%d}", name, freq);
    }

    public String getPath() {
        return path;
    }
}
