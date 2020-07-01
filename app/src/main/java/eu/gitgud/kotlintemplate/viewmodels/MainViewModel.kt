package eu.gitgud.kotlintemplate.viewmodels

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import eu.gitgud.kotlintemplate.di.Item


class MainViewModel @ViewModelInject constructor(
    private val item: Item
) : ViewModel() {

    companion object {
        const val TAG: String = "MainViewModel"
    }

    fun log() {
        Log.d(TAG, "value: ${item.number}")
    }

}