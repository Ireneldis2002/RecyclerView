package com.viewhotel.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.hotel_view_templet, parent, false)) {

    private var imgView: ImageView? = null
    private var txtTittle: TextView? = null
    private var txtSubTittle: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_view)
        txtTittle = itemView.findViewById(R.id.txt_tittle)
        txtSubTittle = itemView.findViewById(R.id.txt_sub_tittle)
    }

    fun bind(data: Hotel){
        imgView?.setImageResource(data.imgView)
        txtTittle?.text = data.textTittle
        txtSubTittle?.text = data.textSubTittle
    }
}