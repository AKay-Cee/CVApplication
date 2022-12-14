package com.example.cvbuilderapp.ui



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cvbuilderapp.R
import com.example.cvbuilderapp.data.Certification
import com.example.cvbuilderapp.data.Education



class AboutFragment : Fragment(R.layout.fragment_about) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initEducation(view)
        initCertification(view)
    }

    private fun initEducation(view: View) {
        val educationRecyclerView = view.findViewById<RecyclerView>(R.id.education_recycler_view)
        val adapter = EducationAdapter(Education.getEducationList())
        educationRecyclerView.adapter = adapter
    }

    private fun initCertification(view: View) {
        val certificationRecycler = view.findViewById<RecyclerView>(R.id.certification_recycler_view)
        val adapter = CertificationAdapter(Certification.getCertificateList())
        certificationRecycler.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = AboutFragment()
    }
}