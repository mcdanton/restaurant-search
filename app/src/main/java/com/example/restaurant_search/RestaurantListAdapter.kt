package com.example.restaurant_search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurant_search.models.Restaurant
import kotlinx.android.synthetic.main.item_restaurant.view.*

class RestaurantListAdapter(var items: MutableList<Restaurant>): RecyclerView.Adapter<RestaurantListViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.item_restaurant, parent, false)
        return RestaurantListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RestaurantListViewHolder, position: Int) {

        val item = items[position]

        holder.setupView(item)

    }

}

class RestaurantListViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    fun setupView(item: Restaurant) {
        view.text_view_restaurant_name.text = item.name
        view.text_view_restaurant_address.text = item.address
        view.text_view_restaurant_price.text = item.priceRange
        view.text_view_restaurant_phone.text = item.phoneNumber
    }
}