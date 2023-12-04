package Semaforo

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.navtareaclase.R
import com.example.navtareaclase.databinding.FragmentSemaforoColorBinding
import java.lang.RuntimeException


class BtnSemaforoFragment : Fragment() {
    private var _binding: FragmentSemaforoColorBinding? = null
    private val binding = _binding!!
    private lateinit var observadorBtnSemaforo: BotonSemaforoListener

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
        val btnSemaforo = view.findViewById<Button>(R.id.btnAvanzar)
        btnSemaforo.setOnClickListener {
            observadorBtnSemaforo.onClickButton()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (activity is BotonSemaforoListener){
            observadorBtnSemaforo = activity as BotonSemaforoListener
        }
        else{
            throw RuntimeException("$context tienes que implementar BotonSemaforoListener")
        }
    }

}