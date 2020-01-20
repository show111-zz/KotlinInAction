package com.tutorials.kotlininaction.chapter6;

import java.io.File;
import java.util.List;

/**
 * Created by hannah on 2020-01-20
 */
public interface FileContentProcessor {
    void processContents(File path, byte[] binaryContents, List<String> textContents);
}

