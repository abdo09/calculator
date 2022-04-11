package ferra.solution.calculator.ui

import androidx.lifecycle.MutableLiveData
import ferra.solution.calculator.base.BaseViewModel

class HomeViewModel : BaseViewModel() {
    var operators = MutableLiveData<ArrayList<String>>()
    var holeContainer: MutableLiveData<String?> = MutableLiveData<String?>()
    var holeContainer1: String? = null
    var result: MutableLiveData<String?> = MutableLiveData<String?>()
    var operationNumber: Int
    var firstOperation: Boolean
    var calculations: Double? = null

    init {
        operators.postValue(arrayListOf())
        holeContainer.postValue("")
        holeContainer1 = ""
        operationNumber = 0
        firstOperation = true
    }

    // When operation sign clicked
    fun changeNumbersContainer(operationType: Int) {
        if (firstOperation) firstOperation = false
        operationNumber = operationType
        var lastChar = ""
        holeContainer.value?.let {
            if (it.isNotEmpty()) lastChar = it.last().toString()
        }
        when (operationType) {
            1 -> {
                if (checkLastCharNotOperatorSign(lastChar = lastChar) && holeContainer.value?.isNotEmpty() == true) {
                    holeContainer.value += "*"
                    operators.value?.add("*")
                }
            }
            2 -> {
                if (checkLastCharNotOperatorSign(lastChar = lastChar) && holeContainer.value?.isNotEmpty() == true) {
                    holeContainer.value += "÷"
                    operators.value?.add("/")
                }
            }
            3 -> {
                if (checkLastCharNotOperatorSign(lastChar = lastChar) && holeContainer.value?.isNotEmpty() == true) {
                    holeContainer.value += "-"
                    operators.value?.add("-")
                }
            }
            4 -> {
                if (checkLastCharNotOperatorSign(lastChar = lastChar) && holeContainer.value?.isNotEmpty() == true) {
                    holeContainer.value += "+"
                    operators.value?.add("+")
                }
            }
        }
    }

    // To get the number from the button when the button is pressed
    fun getNumberFromTheButton(number: Int) {
        holeContainer.value += number.toString()
    }

    private fun checkLastCharNotOperatorSign(lastChar: String?): Boolean {
        return (lastChar != "*" && lastChar != "/" && lastChar != "-" && lastChar != "+")
    }

    fun add(container1: Double, container2: Double): Double {
        return container1 + container2
    }

    fun sub(container1: Double, container2: Double): Double {
        return container1 - container2
    }

    fun multiply(container1: Double, container2: Double): Double {
        return container1 * container2
    }

    fun div(container1: Double, container2: Double): Double {
        return container1 / container2
    }

}