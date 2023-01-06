package com.example.estimation

class modeleBackend {

    //private val coefs = arrayOf(1.12891240e+04f, 2.45339972e+05f, 3.04452539e+03f, 1.03940627e+02f, 9.37766798e+02f) coefs modele regression linéaire
    private val coefs = arrayOf(1.12769029e+04f, 2.43966032e+05f, 2.95877363e+03f, 1.04123316e+02f, 9.36807514e+02f) // coefs model Ridge
    private val b = 22979504.337890167f
    fun estimatePrice(id_mutation: Int, code_type_local: Int, nb_pieces_principal: Int, surface_terrain: Int, surface_reelle_bati: Int): Float {
        return coefs[0] * id_mutation + coefs[1] * code_type_local + coefs[2] * nb_pieces_principal + coefs[3] * surface_terrain + coefs[4] * surface_reelle_bati - b
    }
}
/* dans le backend on a la methode estimatePrice qui prend en paramètre les données rentrées par l'utilisateur qui sont envoyé par le ViewModel
 et elle fait la multplication par les coefficients de notre modèle
avec la variable b qui représente le biais
 */