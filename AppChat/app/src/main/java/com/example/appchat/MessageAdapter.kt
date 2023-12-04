package com.example.appchat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MessageAdapter(private val messageList: List<Message>) : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val authorName: TextView = itemView.findViewById(R.id.authorName)
        val messageText: TextView = itemView.findViewById(R.id.messageText)
        val imgAuthor: ShapeableImageView = itemView.findViewById(R.id.imgAuthor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mensaje_layout, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messageList[position]

        holder.authorName.text = message.authorName
        holder.messageText.text = message.text
        holder.imgAuthor.setImageResource(message.imgAuthor)
    }

    override fun getItemCount(): Int {
        return messageList.size
    }
}