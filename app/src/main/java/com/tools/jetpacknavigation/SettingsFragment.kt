package com.tools.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_settings.*


class SettingsFragment : Fragment(R.layout.fragment_settings) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        amount.setText(SampleData.defaultamount.value.toString())
        submit.setOnClickListener {

            val defaultamount=amount.text.toString()

            SampleData.defaultamount.value=defaultamount.toInt()


        }

        about.setOnClickListener {

           var action= MavgraphDirections.actionGlobalAboutAppFragment()
            findNavController().navigate(action)






        }

    }
}