package dev.waceke.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.waceke.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = Contact("Waceke MWangi", "12345", "shanicemwas@gmail.com", "616 korongo road", "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact2 = Contact("Akuot Totos", "6748374", "dylanmwas@gmail.com", "213 momn", "https://media.istockphoto.com/photos/young-black-ethnicity-female-businesswoman-at-business-reopening-picture-id1309721758?b=1&k=20&m=1309721758&s=170667a&w=0&h=I2_qg1pV1e8xtR3OBxbwIg16sGbfEauKCn8jUcbQlag=frttr")
        var contact3 = Contact("Sammy Bamba", "345123", "samvategenn@gmail.com", "324 olk", "https://images.unsplash.com/photo-1573164574001-518958d9baa2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTl8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact4 = Contact("Effence Kababy", "28907", "efeencekamau@gmail.com", "908 nairobi", "https://images.unsplash.com/photo-1502685104226-ee32379fefbe?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact5 = Contact("Nkimalantoi Joyce", "0789922", "joycecute@gmail.com", "546 nakuru", "https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact6 = Contact("Maimbo Dylan", "789956", "maimbodylan@gmail.com", "222 naivasha", "https://images.unsplash.com/photo-1529245019870-59b249281fd3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contactlist =
            listOf(contact1, contact2, contact3,contact4, contact5, contact6)
        var contactsAdapter = ContactRvAdapter(contactlist)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter

    }
}