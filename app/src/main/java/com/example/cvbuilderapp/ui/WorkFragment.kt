package com.example.cvbuilderapp.ui


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.cvbuilderapp.R
import com.example.cvbuilderapp.data.Work

//import com.example.cvbuilderapplicationassignment6.R
//import com.example.cvbuilderapplicationassignment6.data.Work

class WorkFragment : Fragment(R.layout.fragment_experience) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val workRecyclerView: RecyclerView = view.findViewById(R.id.work_recycler_view)
        val adapter = WorkAdapter(Work.getWorkList())
        workRecyclerView.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = WorkFragment()
    }
}