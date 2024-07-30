package org.andres.training.design.patterns.adapter;

import java.io.InputStream;
import java.util.List;

public interface InputFile {
    List<Person> readFile(InputStream inputStream);
}
