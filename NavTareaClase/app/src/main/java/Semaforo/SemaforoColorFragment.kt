package Semaforo

import Semaforo.model.Semaforo
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navtareaclase.R
import com.example.navtareaclase.databinding.FragmentSemaforoColorBinding

private const val COLOR_SEMAFORO = "param1"

class SemaforoColorFragment : Fragment() {
    private var _binding: FragmentSemaforoColorBinding? = null
    private val binding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSemaforoColorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val colorSemaforo = arguments?.getInt(COLOR_SEMAFORO, Color.RED) ?: Color.RED
        actualizarSemaforo(colorSemaforo)
    }

    private fun actualizarSemaforo(colorSemaforo: Int) {
        binding.semaforo.setBackgroundColor(colorSemaforo)
    }

    companion object {
        @JvmStatic
        fun newInstance(color: Int) =
            SemaforoColorFragment().apply {
                arguments = Bundle().apply {
                    putInt(COLOR_SEMAFORO, color)
                }
            }
    }

}