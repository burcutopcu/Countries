package com.burcutopcu.countries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.burcutopcu.countries.model.Country

class MainActivityViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchData()
    }

    private fun fetchData() {
        val mockData = listOf(Country("A"),
            Country("B"),Country("C"),Country("D"),
            Country("E"),Country("F"),Country("G"),
            Country("H"),Country("I"),Country("J"))

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}