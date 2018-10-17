package com.sulistyolabs.kotlinacademy

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import java.text.FieldPosition

class RecyclerViewAdapter(private val contex: Context, private val items: List<Item>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewGroup: Int) =
            ViewHolder(LayoutInflater.from(contex).inflate(R.layout.item_list, parent , false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val name = view.findViewById<TextView>(R.id.name)
        private val image = view.findViewById<ImageView>(R.id.image)

        fun bindItem(items: Item) {
            name.text = items.name
            items.image?.let { Picasso.get().load(it).into(image) }
        }

    }
}