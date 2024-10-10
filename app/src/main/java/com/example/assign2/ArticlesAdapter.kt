package com.example.assign2

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(val articles: List<Article>): RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
         return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article=articles.get(position)
        holder.imageView.setImageResource(article.imgId)
        holder.titleView.text=article.title
        holder.descView.text=article.desc

        holder.btnView.text=article.btn

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,ArticleDetailsActivity::class.java)
            intent.putExtra("title", article.title)


            intent.putExtra("detail", article.details)
            intent.putExtra("image", article.imgId)
            intent.putExtra("btn", article.btn)
            intent.putExtra("desc", article.desc)

            holder.itemView.context.startActivity(intent)
        }
    }
}