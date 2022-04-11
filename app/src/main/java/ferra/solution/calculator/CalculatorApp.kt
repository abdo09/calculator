package ferra.solution.calculator

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import ferra.solution.calculator.di.appModules
import ferra.solution.calculator.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class CalculatorApp: MultiDexApplication() {

    override fun attachBaseContext(context: Context?) {
        super.attachBaseContext(context)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()

        configureKoin()

        configureTimber()

    }

    private fun configureTimber() {
        //Timber used for logging
        // Logging in Debug build, in release log only crashes
        Timber.plant(Timber.DebugTree())
    }

    private fun configureKoin() {
        startKoin {
            // use the Android context given there
            androidContext(this@CalculatorApp)
            // use AndroidLogger as Koin Logger - default Level.INFO
            androidLogger(Level.ERROR)
            // load properties from assets/koin.properties file
            androidFileProperties()

            modules(listOf(dataModule, appModules))
        }
    }
}