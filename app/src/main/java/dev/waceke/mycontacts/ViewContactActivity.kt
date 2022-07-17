package dev.waceke.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.waceke.mycontacts.databinding.ActivityViewContactBinding

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
        val name =extras?.getString("NAME","")
        val  image=extras?.getString("IMAGE","")
        Picasso.get().load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(300,300)
            .centerCrop()
//            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(binding.ivImage)
        var email= extras?.getString("EMAIL","")
        var call = extras?.getString("CALL", "")
        var message = extras?.getString("MESSAGE", "")
        var video = extras?.getString("VIDEO", "")
        var names = extras?.getString("NAMES", "")


        Toast.makeText(this, "$name: $email", Toast.LENGTH_SHORT).show()
//        Toast.makeText(this, call, Toast.LENGTH_SHORT).show()
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//        Toast.makeText(this, video, Toast.LENGTH_SHORT).show()
//        Toast.makeText(this, names, Toast.LENGTH_SHORT).show()

         binding.tvCall.text = call
         binding.tvMessage.text = message
        binding.tvVideo.text = video
        binding.tvNames.text = names

    }
}