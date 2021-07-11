package com.tools.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       val nav= findNavController()

        choose.setOnClickListener {

            var action=HomeFragmentDirections.actionHomeFragmentToChooseFragment()
        nav.navigate(action)

        }

        balance.setOnClickListener {

            var action=HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            nav.navigate(action)

        }
        transaction.setOnClickListener {
            var action=HomeFragmentDirections.actionHomeFragmentToViewTransactionFragment()
            nav.navigate(action)

        }
    }

}