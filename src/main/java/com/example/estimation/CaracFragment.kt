package com.example.estimation
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.estimation.databinding.CaracFragmentBinding


/* Lorsque l'utilisateur clique sur le bouton, les valeurs saisies sont récupérées et passées à la méthode estimatePrice de du ViewModel estimationViewModel.
Ensuite, le résultat de l'estimation est observé et, s'il n'est pas égal à 0, le résultat est passé à l'action de navigation ,
qui permet de naviguer vers le Fragment d'estimation en passant en paramètre le résultat de l'estimation.*/


class CaracFragment : Fragment() {
    private lateinit var binding: CaracFragmentBinding
    val estimationViewModel: EstimationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = CaracFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            binding.button.setOnClickListener {
                val id_mutation = binding.idMutation.text.toString().toInt()
                val type_local = binding.local.text.toString().toInt()
                val nbPieces_Principal = binding.nbpiecesPrincipal.text.toString().toInt()
                val surface_Terrain = binding.surfaceTerrain.text.toString().toInt()
                val surface_Reelle_Bati = binding.surfaceRelleBatiment.text.toString().toInt()

                estimationViewModel.estimatePrice(id_mutation, type_local, nbPieces_Principal, surface_Terrain, surface_Reelle_Bati)



            }
        estimationViewModel.estimationResult.observe(viewLifecycleOwner){ value->
            if (value != 0.0f){
                val action = CaracFragmentDirections.actionCaracFragmentToEstimationFragment(value)
                findNavController().navigate(action)
            }


        }

    }
}