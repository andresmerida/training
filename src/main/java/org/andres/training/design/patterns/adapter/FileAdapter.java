package org.andres.training.design.patterns.adapter;

import java.io.InputStream;
import java.util.List;

public class FileAdapter {
    private final InputFile inputFile;

    public FileAdapter(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public List<Person> readFile(InputStream inputStream) {
        return this.inputFile.readFile(inputStream);
    }
}
