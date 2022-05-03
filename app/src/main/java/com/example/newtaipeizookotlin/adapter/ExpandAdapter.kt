package com.example.newtaipeizookotlin.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newtaipeizookotlin.ListViewPager
import com.example.newtaipeizookotlin.R
import com.example.newtaipeizookotlin.datalist.ExpandListData
import java.util.*

class ExpandAdapter : RecyclerView.Adapter<ExpandAdapter.ViewHolder>() {
    private val mExpandListData = ArrayList<String>()
    private var mExpandRecycleViewClickListener: ExpandRecycleViewClickListener? = null

    @SuppressLint("NotifyDataSetChanged")
    fun setData(
        pExpandListData: ArrayList<String>?,
        pExpandRecycleViewClickListener: ExpandRecycleViewClickListener?
    ) {
        mExpandRecycleViewClickListener = pExpandRecycleViewClickListener

        if (pExpandListData != null) {
            mExpandListData.addAll(pExpandListData)
        }
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.expanditem, parent, false)
        return ViewHolder(view, mExpandRecycleViewClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mName.text = mExpandListData[position]

        holder.itemView.setOnClickListener {
            Log.d("GGGGG", "11")
        }
    }


    override fun getItemCount(): Int {
        return mExpandListData.size
    }


    class ViewHolder(
        itemView: View,
        pExpandRecycleViewClickListener: ExpandRecycleViewClickListener?
    ) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var mName: TextView = itemView.findViewById(R.id.mExpanditem)

        private var mExpandRecycleViewClickListener: ExpandRecycleViewClickListener? =
            pExpandRecycleViewClickListener

        override fun onClick(v: View?) {
            mExpandRecycleViewClickListener?.onViewClicked(adapterPosition + 1)
        }

    }

    interface ExpandRecycleViewClickListener {
        fun onViewClicked(position: Int)
    }
}