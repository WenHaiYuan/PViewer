package com.will.pviewer.data

/**
 * created  by will on 2020/8/23 15:32
 */
class ArticleWithPicturesRepository private constructor(
    val dao: ArticleWithPicturesDao
){

    companion object {
        @Volatile private var instance: ArticleWithPicturesRepository? = null

        fun getInstance(dao: ArticleWithPicturesDao) =
            instance ?: synchronized(this){
                instance ?: ArticleWithPicturesRepository(dao).also { instance = it }
            }
    }
}