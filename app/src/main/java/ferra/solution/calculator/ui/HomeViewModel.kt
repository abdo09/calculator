package ferra.solution.calculator.ui

import androidx.lifecycle.MutableLiveData
import ferra.solution.calculator.base.BaseViewModel
import ferra.solution.calculator.util.listOfSigns
import ferra.solution.calculator.util.replaceSignsWithSpace
import timber.log.Timber
import kotlin.math.sqrt

class HomeViewModel : BaseViewModel() {
    var operators = MutableLiveData<ArrayList<String>>()
    var holeContainer: MutableLiveData<String?> = MutableLiveData<String?>()
    var clearAll: MutableLiveData<String?> = MutableLiveData<String?>()
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

    fun clearAll(clear: Char = 'C'){
        clearAll.postValue(clear.toString())
    }

    // To get the number from the button when the button is pressed
    fun getNumberFromTheButton(number: Char) {
        var lastChar = ""
        holeContainer.value?.let {
            if (it.isNotEmpty()) lastChar = it.last().toString()
        }

        val numbers = holeContainer.value?.replaceSignsWithSpace()?.split(" ")

        if (numbers?.get(numbers.size - 1)?.contains('.' ) != true && lastChar.isNotEmpty() && numbers?.get(numbers.size - 1)?.isNotEmpty() == true ) {
            holeContainer.value += number.toString()
        }
        else if (number != '.') {
            holeContainer.value += number.toString()
        }
        else if (number != '.' && checkLastCharNotOperatorSign(lastChar = lastChar) && lastChar.isNotEmpty()) {
            holeContainer.value += number.toString()
        }

    }

    private fun checkLastCharNotOperatorSign(lastChar: String?): Boolean {
        return (lastChar != "*" && lastChar != "/" && lastChar != "-" && lastChar != "+" && lastChar != ".")
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

    fun plusOrMinus(result: String): Double {
        val resultValue = result.toDouble()
        return if (resultValue != 0.0) (resultValue * -1) else 0.0
    }

    fun sqrt(result: String): Double {
        val sqrtValue = result.toDouble()
        return if (sqrtValue != 0.0) sqrt(sqrtValue) else 0.0
    }

    fun deleteButton() {
        holeContainer1 = holeContainer.value?.dropLast(1)?.replaceSignsWithSpace()
        holeContainer.postValue(holeContainer.value?.dropLast(1))
        val sign = holeContainer.value?.listOfSigns()

        holeContainer1?.split(" ")?.forEachIndexed { index, number ->
            when {
                index == 0 -> {
                    try {
                        calculations = if (number.isNotEmpty()) number.toDouble() else 0.0
                    } catch (e: Exception){
                        Timber.d(e)
                    }
                }
                index > 0 -> {
                    try {
                        when (sign?.get(index - 1)) {
                            "*" -> {
                                try {
                                    calculations = multiply(calculations!!, number.toDouble())
                                } catch (e: Exception) {
                                    Timber.d(e)
                                }
                            }
                            "÷" -> {
                                try {
                                    calculations = div(calculations!!, number.toDouble())
                                } catch (e: Exception) {
                                    Timber.d(e)
                                }
                            }
                            "-" -> {
                                try {
                                    calculations = sub(calculations!!, number.toDouble())
                                } catch (e: Exception) {
                                    Timber.d(e)
                                }
                            }
                            "+" -> {
                                try {
                                    calculations = add(calculations!!, number.toDouble())
                                } catch (e: Exception) {
                                    Timber.d(e)
                                }
                            }
                        }
                    } catch (e: Exception){
                        Timber.d(e)
                    }
                }
                else -> {
                    calculations = 0.0
                }
            }
        }
        if (calculations == 0.0 && holeContainer1?.isEmpty() == true) {
            result.postValue("")
        } else if (calculations == 0.0 && holeContainer1?.isNotEmpty() == true) {
            result.postValue(0.0.toString())
        }else{
            result.postValue(calculations.toString())
        }
    }

}