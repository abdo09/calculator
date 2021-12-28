package ferra.solution.calculator.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import ferra.solution.calculator.base.BaseViewModel

class HomeViewModel : BaseViewModel() {

    var container1 = MutableLiveData<String>()
    var container2 = MutableLiveData<String>()
    var container3 = MutableLiveData<String>()
    var holeContainer: MutableLiveData<String?> = MutableLiveData<String?>()
    var result: MutableLiveData<String?> = MutableLiveData<String?>()
    var operationNumber: Int
    var firstOperation: Boolean
    var isDarkMode = true
    var zero = 0
    var one = 1
    var two = 2
    var three = 3
    var four = 4
    var five = 5
    var six = 6
    var seven = 7
    var eight = 8
    var nine = 9

    init {
        container1.postValue("")
        container2.postValue("")
        container3.postValue("")
        holeContainer.postValue("")
        operationNumber = 0
        firstOperation = true
    }

    // When operation sign clicked
    fun changeNumbersContainer(operationType: Int) {
        if(firstOperation) firstOperation = false
        operationNumber = operationType
        var lastChar = ""
        holeContainer.value?.let {
            if (it.isNotEmpty()) lastChar = it.last().toString()
        }
        when (operationType) {
            1 -> {
                if (checkLastCharNotOperatorSign(lastChar = lastChar) && holeContainer.value?.isNotEmpty() == true){
                    holeContainer.value += "*"
                    container2.postValue("")
                }
            }
            2 -> {
                if (checkLastCharNotOperatorSign(lastChar = lastChar) && holeContainer.value?.isNotEmpty() == true) {
                    holeContainer.value += "/"
                    container2.postValue("")
                }
            }
            3 -> {
                if (checkLastCharNotOperatorSign(lastChar = lastChar) && holeContainer.value?.isNotEmpty() == true) {
                    holeContainer.value += "-"
                    container2.postValue("")
                }
            }
            4 -> {
                if (checkLastCharNotOperatorSign(lastChar = lastChar) && holeContainer.value?.isNotEmpty() == true) {
                    holeContainer.value += "+"
                    container2.postValue("")
                }
            }
        }
    }

    // To get the number from the button when the button is pressed
    fun getNumberFromTheButton(number: Int) {
        holeContainer.value += number.toString()
        container2.value += number.toString()
    }

    private fun checkLastCharNotOperatorSign(lastChar: String?): Boolean {
        return (lastChar != "*" && lastChar != "/" && lastChar != "-" && lastChar != "+")
    }

    fun add(container1: Double, container2: Double): Double{
        return container1 + container2
    }

    fun sub(container1: Double, container2: Double): Double{
        return container1 - container2
    }

    fun multiply(container1: Double, container2: Double): Double{
        return container1 * container2
    }

    fun div(container1: Double, container2: Double): Double{
        return container1 / container2
    }

}