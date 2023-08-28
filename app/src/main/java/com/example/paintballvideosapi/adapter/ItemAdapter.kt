package com.example.paintballvideosapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.paintballvideosapi.api.model.Video
import com.example.paintballvideosapi.api.model.nebenCL.Items
import com.example.paintballvideosapi.databinding.VideoItemBinding

class ItemAdapter(
    val dataset : List<Items>
):  RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: VideoItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            VideoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
    return dataset.size   }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.binding.titleTV.text = item.snippet!!.title

        val imgUrl = item.snippet!!.thumbnails!!.high!!.url!!.toUri().buildUpon().scheme("https").build()

        holder.binding.videoVV.load(imgUrl)



//        holder.binding.videoVV.context
    }

}