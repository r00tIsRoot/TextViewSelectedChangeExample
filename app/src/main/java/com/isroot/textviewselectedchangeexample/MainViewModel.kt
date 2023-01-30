package com.isroot.textviewselectedchangeexample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val _currentClicked = MutableLiveData<Int>()
    val currentClicked: LiveData<Int> = _currentClicked

    init {
        _currentClicked.value = 0
    }


    fun isSelected(currentClicked: Int, thisArg: Int): Boolean {
        return currentClicked == thisArg
    }
}