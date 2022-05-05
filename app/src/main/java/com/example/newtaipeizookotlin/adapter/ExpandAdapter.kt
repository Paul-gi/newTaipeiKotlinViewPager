package com.example.newtaipeizookotlin.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newtaipeizookotlin.R
import okhttp3.internal.notify
import okhttp3.internal.notifyAll

class ExpandAdapter : RecyclerView.Adapter<ExpandAdapter.ViewHolder>() {
    private val mExpandListData = ArrayList<String>()
    private var mExpandRecycleViewClickListener: ExpandRecycleViewClickListener? = null
    private var mClickedPosition = -1

    @SuppressLint("NotifyDataSetChanged")
    fun setData(
        pExpandListData: ArrayList<String>?,
        pExpandRecycleViewClickListener: ExpandRecycleViewClickListener?
    ) {
        mExpandRecycleViewClickListener = pExpandRecycleViewClickListener
        mExpandListData.clear()
        if (pExpandListData != null) {
            mExpandListData.addAll(pExpandListData)
        }
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.expanditem, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mName.text = mExpandListData[position]

        if (mClickedPosition == position){
            holder.mName.setBackgroundColor(Color.BLUE)
        }else{
            holder.mName.setBackgroundColor(0)
        }

        holder.mName.setOnClickListener {
            mClickedPosition = mExpandRecycleViewClickListener?.onViewClicked(position) ?: -1
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return mExpandListData.size
    }


    class ViewHolder(
        itemView: View,
//        pExpandRecycleViewClickListener: ExpandRecycleViewClickListener?
    ) : RecyclerView.ViewHolder(itemView) {
        var mName: TextView = itemView.findViewById(R.id.mExpanditem)
        //override fun onClick(v: View?) {


//
//        private var mExpandRecycleViewClickListener: ExpandRecycleViewClickListener? =
//            pExpandRecycleViewClickListener
//
//        override fun onClick(v: View?) {
//            mExpandRecycleViewClickListener?.onViewClicked(adapterPosition)
//            itemView.setBackgroundColor(R.string.blue)
//        }
//
//        init {
//            itemView.setOnClickListener(this)
//        }

    }

    interface ExpandRecycleViewClickListener {
        fun onViewClicked(position: Int):Int
    }
}