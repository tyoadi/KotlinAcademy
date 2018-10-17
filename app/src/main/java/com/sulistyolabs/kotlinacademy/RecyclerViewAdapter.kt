package com.sulistyolabs.kotlinacademy

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class RecyclerViewAdapter(private val contex: Context, private val item: List<Item>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            RecyclerView.ViewHolder(LayoutInflater.from(contex).inflate(R.layout.item_list, parent, false)) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.


                override fun getItemCount(): Int {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onBindViewHolder(p0: RecyclerViewAdapter.ViewHolder, p1: Int) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                class ViewHolder {

                }
            }