package com.example.estimation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
/* ici on a un ViewModel très basique avec la livedate mutable  _estimationResult en private et qui n'est accesible que par le ViewModel
 pour la sécurité et qui fait appel à la méthode du backend*/




class EstimationViewModel () : ViewModel() {

    private val _estimationResult = MutableLiveData<Float>(0f)
    val estimationResult: LiveData<Float>
        get() = _estimationResult

    fun estimatePrice(id_mutation: Int, code_type_local: Int, nb_pieces_principal: Int, surface_terrain: Int, surface_reelle_bati: Int) {
        val model = modeleBackend()
            val prix = model.estimatePrice(
                id_mutation,
                code_type_local,
                nb_pieces_principal,
                surface_terrain,
                surface_reelle_bati
            )

            _estimationResult.value = prix

    }
}