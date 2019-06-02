package com.gathergood.calum.polymorph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_search.*


class SearchFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        search_recyclerview.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = SearchAdapter(generateTestData())
        }
    }

    private fun generateTestData(): List<String> {
        val values = mutableListOf<String>()
        for (i in 0..100) {
            values.add("$i entry")
        }
        return values
    }
}
