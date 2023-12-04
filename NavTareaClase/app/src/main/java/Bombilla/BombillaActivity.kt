package Bombilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.IdRes
import com.example.navtareaclase.R
import com.example.navtareaclase.databinding.ActivityBombillaBinding

class BombillaActivity : AppCompatActivity(), InterruptorBombillaListener {
    private lateinit var binding: ActivityBombillaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBombillaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onclickBoton(@IdRes btnId:Int) {
        Log.d("BombillaActivity", "Boton Interruptor pulsado")
        val imgBobmillaFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentImgBombilla) as ImgBobmillaFragment

        imgBobmillaFragment.actualizaBombilla(btnId)
    }
}