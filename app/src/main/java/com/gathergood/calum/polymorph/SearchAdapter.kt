package com.gathergood.calum.polymorph

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class SearchAdapter(private val dataset: List<String>) :
    RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class ViewHolder(private val layout: ConstraintLayout) : RecyclerView.ViewHolder(layout) {

        var resultImageView: ImageView? = null
        var resultTitleTextView: TextView? = null
        var resultSubtitleTextView: TextView? = null

        init {
            resultImageView = layout.findViewById(R.id.result_imageview)
            resultTitleTextView = layout.findViewById(R.id.result_title_textview)
            resultSubtitleTextView = layout.findViewById(R.id.result_subtitle_textview)
        }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SearchAdapter.ViewHolder {
        // create a new view
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.search_result_list_item, parent, false) as ConstraintLayout
        // set the view's size, margins, paddings and layout parameters
        return ViewHolder(layout)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        holder.resultSubtitleTextView?.text = dataset[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataset.size
}