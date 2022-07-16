package dev.waceke.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.waceke.mycontacts.databinding.ActivityMainBinding
import dev.waceke.mycontacts.databinding.ContactListItemsBinding

class ContactRvAdapter(var  contactlist: List<Contact>): RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding =
        ContactListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactsViewHolder = ContactsViewHolder(binding)
        return  contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactlist.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvContact.text = currentContact.phoneNumber
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvAddress.text = currentContact.address
        Picasso.get().load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(300,300)
            .centerCrop()
//            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(holder.binding.ivContacts)


    }

    override fun getItemCount(): Int {
        return contactlist.size
    }


}

class ContactsViewHolder(var binding: ContactListItemsBinding): RecyclerView.ViewHolder(binding.root)
//    var tvName = itemView.findViewById<TextView>(R.id.tvName)
//    var tvContact = itemView.findViewById<TextView>(R.id.tvContact)
//    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//    var tvAddress= itemView.findViewById<TextView>(R.id.tvAddress)
//    var ivContacts = itemView.findViewById<ImageView>(R.id.ivContacts)

//}