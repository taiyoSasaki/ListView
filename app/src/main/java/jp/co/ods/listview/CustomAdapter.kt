package jp.co.ods.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import jp.co.ods.listview.databinding.ItemLayoutBinding

class CustomAdapter(private val context: Context, private val fruitList: ArrayList<String>) : BaseAdapter() {
    private val mLayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return fruitList.size
    }

    override fun getItem(position: Int): Any? {
        return fruitList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var view = convertView

        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.item_layout, parent, false)
        }

        val binding = ItemLayoutBinding.bind(view!!)

        binding.fruitNameText.text = fruitList[position]

        return view
    }

}