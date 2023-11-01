package com.example.baitaplistview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class item_adapter (val items: ArrayList<MainActivity.Email>): BaseAdapter() {
    override fun getCount(): Int = items.size
    override fun getItem(p0: Int): Any = items[p0]
    override fun getItemId(p0: Int): Long = p0.toLong()
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var viewHolder: MyViewHolder
        var itemView: View
        if (p1 == null) {
            itemView = LayoutInflater.from(p2?.context)
                .inflate(R.layout.custom_item_view, p2, false)
            viewHolder = MyViewHolder()
            viewHolder.imagethum = itemView.findViewById(R.id.image_thumb)
            viewHolder.itemsubject = itemView.findViewById(R.id.item_Subject)
            viewHolder.itemdecription = itemView.findViewById(R.id.item_noidung)
            viewHolder.itemtime=itemView.findViewById(R.id.item_time)
            viewHolder.itemstar=itemView.findViewById(R.id.item_star)
            itemView.tag = viewHolder
        } else {
            itemView = p1
            viewHolder = itemView.tag as MyViewHolder
        }
        viewHolder.imagethum.setImageResource(items[p0].iconthumbnail)
        viewHolder.itemsubject.text=items[p0].subject
        viewHolder.itemdecription.text=items[p0].description
        viewHolder.itemtime.text=items[p0].time

        return itemView
    }

    class MyViewHolder {
        lateinit var imagethum: ImageView
        lateinit var itemsubject: TextView
        lateinit var itemdecription: TextView
        lateinit var itemtime: TextView
        lateinit var itemstar: ImageView
    }
}