package com.pinguapps.masterdetail.data.local

import com.pinguapps.masterdetail.data.model.ModelClass

fun getMockData(): MutableList<ModelClass> {

    val mutableList = mutableListOf<ModelClass>()
    for (i in 1..24) {
        val item = ModelClass("Title $i",
            "Subtitle $i",
        "detail $i",
        "detailB $i",
        "detailC $i",
        mutableListOf("list item 1",
            "list item 2",
            "list item 3")
        )
        mutableList.add(item)
    }
    return mutableList
}