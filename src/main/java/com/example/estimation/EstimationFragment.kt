package com.example.estimation
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.example.estimation.databinding.EstimationFragmentBinding

class EstimationFragment : Fragment() {

    private lateinit var binding: EstimationFragmentBinding
    val args : EstimationFragmentArgs by navArgs ()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = EstimationFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text=getString(R.string.estimation_text_format,args.estimation)

    }
}

/* notre deuxième fragment EstimationFragment reçoit la valeur de l'estimation dans un safearg et l'affiche */


