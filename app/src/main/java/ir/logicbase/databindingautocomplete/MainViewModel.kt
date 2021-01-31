package ir.logicbase.databindingautocomplete

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _helloWorldVisibility = MutableLiveData<Boolean>()
    val helloWorldVisibility: LiveData<Boolean> = _helloWorldVisibility

    init {
        _helloWorldVisibility.value = true
    }

    fun onChangeVisibilityClick() {
        val visibility = _helloWorldVisibility.value ?: false
        _helloWorldVisibility.value = !visibility
    }
}