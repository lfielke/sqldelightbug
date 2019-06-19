package com.example.mylibrary

import com.example.sqldelightbug.EntriesQueries
import com.example.sqldelightbug.PartialInfo
import javax.inject.Inject


class DbUser @Inject constructor(val entriesQueries: EntriesQueries) {

    fun all(): List<PartialInfo> {
        return entriesQueries.partialInfo("asd").executeAsList()
    }
}