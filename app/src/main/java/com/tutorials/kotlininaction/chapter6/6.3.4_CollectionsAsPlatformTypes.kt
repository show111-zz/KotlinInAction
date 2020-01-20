package com.tutorials.kotlininaction.chapter6

import java.io.File

/**
 *  Created by hannah on 2020-01-20
 */
class FileIndexer : FileContentProcessor{
    override fun processContents(
        path: File?,
        binaryContents: ByteArray?,
        textContents: MutableList<String>?
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class PersonParser: DataParser<Person3>{
    override fun parseData(
        input: String?,
        output: MutableList<Person3>?,
        errors: MutableList<String>?
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
