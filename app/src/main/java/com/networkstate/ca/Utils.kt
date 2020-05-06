package com.networkstate.ca

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class Utils {
    companion object {
        fun setConnectionStatus(
            context: Context,
            textView: TextView,
            imageView: ImageView,
            isConnected: Boolean
        ) {
            if (isConnected) {
                imageView.setImageResource(R.drawable.ic_connected)
                textView.text = context.getString(R.string.status_connected)
                imageView.setColorFilter(
                    ContextCompat.getColor(context, R.color.colorConnected),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                textView.setTextColor(ContextCompat.getColor(context, R.color.colorConnected))
            } else {
                imageView.setImageResource(R.drawable.ic_no_connection)
                textView.text = context.getString(R.string.status_no_connection)
                imageView.setColorFilter(
                    ContextCompat.getColor(context, R.color.colorNoConnection),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                textView.setTextColor(ContextCompat.getColor(context, R.color.colorNoConnection))
            }
        }
    }
}