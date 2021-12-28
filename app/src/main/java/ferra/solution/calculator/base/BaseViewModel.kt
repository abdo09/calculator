package ferra.solution.calculator.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel: ViewModel(), CoroutineScope {

    //Coroutine's background job
    private val job = Job()

    //start with a logged of user
    val userLogged = MutableLiveData<Boolean>()

    //Define default thread for Coroutine as Main and add job
    override val coroutineContext: CoroutineContext = Dispatchers.Main + job

    override fun onCleared() {
        super.onCleared()

        job.cancel()

        if (coroutineContext.isActive){
            coroutineContext.cancel()
        }
    }
}