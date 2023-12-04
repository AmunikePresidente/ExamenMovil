package Bombilla

import Bombilla.model.Bombilla
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navtareaclase.R
import com.example.navtareaclase.databinding.FragmentBtnBombillaBinding
import com.example.navtareaclase.databinding.FragmentImgBobmillaBinding

class ImgBobmillaFragment : Fragment() {

    private var _binding: FragmentImgBobmillaBinding? = null
    private val binding get() = _binding!!
    private val bombilla = Bombilla()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentImgBobmillaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        actualizarImgBombilla()
    }

    fun actualizaBombilla(btnId: Int) {

        if(btnId == R.id.btnEncender){
            bombilla.encender()
        }
        else {
            bombilla.apagar()
        }
        actualizarImgBombilla()
    }

    private fun actualizarImgBombilla() {
        if (bombilla.estaEncendida()){
            binding.imgBombilla.setImageResource(R.drawable.encendida)
        }
        else {
            binding.imgBombilla.setImageResource(R.drawable.apagada)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}