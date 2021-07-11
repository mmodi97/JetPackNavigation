package com.tools.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_choose.*
import kotlinx.android.synthetic.main.fragment_send_cash.*

class ChooseFragment : Fragment(R.layout.fragment_choose) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        namesubmit.setOnClickListener {

            var recname:String=name.text.toString();
            val action =ChooseFragmentDirections.actionChooseFragmentToSendCashFragment(recname)


            findNavController().navigate(action)
        }


        cancel_action.setOnClickListener {
            findNavController().popBackStack(R.id.homeFragment,true)
        }

    }
}