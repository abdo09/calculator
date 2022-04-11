package ferra.solution.calculator.di

import ferra.solution.calculator.ui.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModules = module {

    viewModel { HomeViewModel() }

}