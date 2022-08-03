package kg.geektech.lovecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.geektech.lovecalculator.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
        listener()
    }

    private fun onClick() {
        val firstName = arguments?.getString("fname")
        val secondName = arguments?.getString("s")
        val percentage = arguments?.getString("percentage")
        val result = arguments?.getString("result")

        binding.tvFirstName.text = firstName
        binding.tvSecondName.text = secondName
        binding.tvPercent.text = percentage
        binding.result.text = result
    }

    private fun listener() {
        binding.btnTryAgain.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}