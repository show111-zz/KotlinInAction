package com.tutorials.kotlininaction.chapter6;

import java.util.List;

/**
 * Created by hannah on 2020-01-20
 */
public interface DataParser<T> {
    void parseData(String input, List<T> output, List<String> errors);
}
