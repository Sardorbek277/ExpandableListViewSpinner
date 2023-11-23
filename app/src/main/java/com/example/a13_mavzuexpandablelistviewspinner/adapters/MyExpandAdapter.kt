package com.example.a13_mavzuexpandablelistviewspinner.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListAdapter
import android.widget.TextView
import androidx.core.graphics.convertTo
import com.example.a13_mavzuexpandablelistviewspinner.R

class MyExpandAdapter(var titleList:ArrayList<String>, var map:HashMap<String, List<String>>) :BaseExpandableListAdapter() {
    override fun getGroupCount(): Int =titleList.size

    override fun getChildrenCount(p0: Int): Int {
        return map[titleList[p0]]?.size!!
    }

    override fun getGroup(p0: Int): Any {
        return titleList[p0]
    }

    override fun getChild(p0: Int, p1: Int): Any {
        val group = titleList[p0]
        return map[group]?.get(p1)!!
    }

    override fun getGroupId(p0: Int): Long {

        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p0.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
        var itemView:View
        if (p2!=null){
            itemView=p2
        }else{
        itemView = LayoutInflater.from(p3?.context).inflate(R.layout.parent_item, p3, false)
        }
        itemView.findViewById<TextView>(R.id.tv_name).text = titleList[p0]
        return itemView
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
        var itemView:View
        if (p3!=null){
            itemView=p3
        }else{
            itemView = LayoutInflater.from(p4?.context).inflate(R.layout.child_item, p4, false)
        }
        val f = map[titleList[p0]]?.get(p1)
        itemView.findViewById<TextView>(R.id.tv_namee).text = f
        return itemView
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }
}