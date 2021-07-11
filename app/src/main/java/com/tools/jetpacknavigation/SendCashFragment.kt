package com.tools.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_send_cash.*

class SendCashFragment : Fragment(R.layout.fragment_send_cash) {


    private val args:SendCashFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val name=args.receivername.toString()

        amount.setText(SampleData.defaultamount.value.toString())
        SampleData.defaultamount.observe(viewLifecycleOwner){
            amount.setText(it.toString())
        }

        receivertext.text="Send Cash to $name"
        submit.setOnClickListener {

            if(amount.text.toString().isEmpty()) {
                Toast.makeText(requireContext(), "Please Enter Amount", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            val amount1=amount.text.toString()
            var action=SendCashFragmentDirections.actionSendCashFragmentToDialogFragment(name,Integer.parseInt(amount1));
            findNavController().navigate(action)

        }

    }

}