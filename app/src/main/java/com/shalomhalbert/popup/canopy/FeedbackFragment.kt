package com.shalomhalbert.popup.canopy


import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FeedbackFragment : Fragment() {

    companion object {
        val TAG = FeedbackFragment::class.java.simpleName
        fun newInstance() = FeedbackFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_feedback, container, false)

        view.findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                    RecommendationsFragment.newInstance(), RecommendationsFragment.TAG).commit()
        }
        return view
    }


}
