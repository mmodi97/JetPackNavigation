package com.tools.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_send_cash.*
import kotlinx.android.synthetic.main.fragment_view_transaction.*


class ViewTransactionFragment : Fragment(R.layout.fragment_view_transaction) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nav= findNavController()
        var action=ViewTransactionFragmentDirections.actionViewTransactionFragmentToSendCashFragment("test")



        sendmoney.setOnClickListener {

            nav.navigate(action)
        }
    }

}