package org.andres.training.common;

import java.util.Optional;

public class OutPutClass {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        String result = optional.orElse("default");
        System.out.println(result);
    }
}
