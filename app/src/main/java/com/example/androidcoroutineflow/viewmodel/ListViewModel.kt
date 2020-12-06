package com.example.androidcoroutineflow.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.androidcoroutineflow.model.NewsRepository

class ListViewModel: ViewModel() {

    val newsArticles = NewsRepository().getNewsArticles().asLiveData()

}