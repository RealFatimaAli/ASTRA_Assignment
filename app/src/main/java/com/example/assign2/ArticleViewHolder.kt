package com.example.assign2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val imageView:ImageView=itemView.findViewById(R.id.img1)
         val titleView: TextView =itemView.findViewById(R.id.title1)
         val descView:TextView=itemView.findViewById(R.id.desc1)
         val btnView:TextView=itemView.findViewById(R.id.btn1)
//         val detailsView:TextView=itemView.findViewById(R.id.details1)

}