package ferra.solution.calculator.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ferra.solution.calculator.R
import ferra.solution.calculator.base.BaseSupportActivity

class MainActivity : BaseSupportActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}