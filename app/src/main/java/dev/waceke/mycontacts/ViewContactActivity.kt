package dev.waceke.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.waceke.mycontacts.databinding.ActivityViewContactBinding
import java.util.jar.Attributes

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
        val  image=extras?.getString("IMAGE","")
        Picasso.get().load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(300,300)
            .centerCrop()
//            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(binding.ivImage)
        val person=extras?.getString("NAME","")
        binding.tvName.text = person
        val contact = extras?.getString("CONTACT", "")
        binding.tvPhonenumber.text = contact
        val email = extras?.getString("EMAIL", "")
        binding.tvMail.text = email
        val address = extras?.getString("ADDRESS", "")
        binding.tvLocation.text = address


        Toast.makeText(this, "$person: $email", Toast.LENGTH_LONG).show()



    }
}