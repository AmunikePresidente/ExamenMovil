package Semaforo

import Semaforo.model.Semaforo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.example.navtareaclase.databinding.ActivitySemaforoBinding

class SemaforoActivity : AppCompatActivity(), BotonSemaforoListener {
    private lateinit var binding: ActivitySemaforoBinding
    private val semaforo = Semaforo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySemaforoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null){
            val fragmentContainerColor = binding.fragmentColorSemaforo
            val semaforoColorFragment = SemaforoColorFragment()
            supportFragmentManager
                .beginTransaction()
                .add(fragmentContainerColor.id, semaforoColorFragment)
                .commit()
        }

        if (savedInstanceState == null){
            val fragmentContainerBtnSemaforo = binding.fragmentColorSemaforo
            val semaforoBtnFragment = BtnSemaforoFragment()
            supportFragmentManager
                .beginTransaction()
                .add(fragmentContainerBtnSemaforo.id, semaforoBtnFragment)
                .commit()
        }

    }

    override fun onClickButton() {
        semaforo.avanzar()
        val semaforoColorFragment = SemaforoColorFragment.newInstance(semaforo.color)
        val fragmentContainerColor = binding.fragmentColorSemaforo
        supportFragmentManager
            .beginTransaction()
            .replace(fragmentContainerColor.id, semaforoColorFragment)
            .commit()
    }
}