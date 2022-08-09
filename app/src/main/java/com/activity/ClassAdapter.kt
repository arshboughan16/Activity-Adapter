package com.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class BaseAdapterClass(var context: Context, var arrayList: ArrayList<ABC>): BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size

    }

    override fun getItem(p0: Int): Any {
        return arrayList[p0]

    }

    override fun getItemId(p0: Int): Long {
        return (arrayList[p0].id?:0).toLong()

    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var initView = LayoutInflater.from(context).inflate(R.layout.adapter_layout, p2, false)
        var tvName = initView.findViewById<TextView>(R.id.tvName)
        var tvId = initView.findViewById<TextView>(R.id.tvId)
        var tvRollNo = initView.findViewById<TextView>(R.id.tvRollNo)

        tvName.setText(arrayList[p0].name.toString())
        tvId.setText(arrayList[p0].id.toString())
        tvRollNo.setText(arrayList[p0].rollno.toString())
        return initView
    }
}