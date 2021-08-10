package org.bedu.segurapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import org.bedu.segurapp.R

class AddContactActivity : AppCompatActivity() {

    private lateinit var login_animation: LottieAnimationView
    private lateinit var etPhoneAdd : EditText
    private lateinit var etUserAdd: EditText
    private lateinit var btn_save_contact:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)

        login_animation = findViewById(R.id.login_animation)
        etPhoneAdd = findViewById(R.id.etPhoneAdd)
        etUserAdd = findViewById(R.id.etUserAdd)
        btn_save_contact = findViewById(R.id.btn_save_contact)

        setAnimation()

        btn_save_contact.setOnClickListener{
            Toast.makeText(this,"Contacto agregado existosamente",Toast.LENGTH_LONG).show()

        }
    }

    private fun setAnimation() {
        login_animation.setAnimation("user.json")
        login_animation.playAnimation()
    }

}