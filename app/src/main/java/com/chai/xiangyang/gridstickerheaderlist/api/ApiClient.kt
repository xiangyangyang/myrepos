package com.chai.xiangyang.gridstickerheaderlist.api

import com.chai.xiangyang.gridstickerheaderlist.data.entity.BookEntity
import retrofit2.http.GET
import rx.Observable

interface ApiClient {
    @GET()
    fun getBookList(): Observable<List<BookEntity>>
}