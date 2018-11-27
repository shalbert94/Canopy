package com.shalomhalbert.popup.canopy


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class WelcomeFragment : Fragment() {

    companion object {
        val TAG = WelcomeFragment::class.java.simpleName
        fun newInstance() = WelcomeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        view.findViewById<Button>(R.id.okayButton).setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                    FeedbackFragment.newInstance(), FeedbackFragment.TAG).commit()
        }

        return view
    }


}
