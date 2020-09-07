package com.dp13.animalencyclopedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAnimalAdapter(private val listAnimal: ArrayList<Animal>): RecyclerView.Adapter<ListAnimalAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallBack: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallBack = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_animal, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAnimal.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val animal = listAnimal[position]
        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = animal.name
        holder.tvDetail.text = animal.description
        holder.itemView.setOnClickListener { onItemClickCallBack.onItemClicked(listAnimal[holder.adapterPosition]) }
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Animal)
    }


}