package com.tools.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_dialog.*


class DialogFragment : BottomSheetDialogFragment(){


   private val args:DialogFragmentArgs by navArgs()
   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      return inflater.inflate(R.layout.fragment_dialog,container,false)
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)

      var receivername=args.receivername.toString()
      var amount1=args.amount.toString()

      sendtext.text = "Do you want to send $amount1 to $receivername ?"

      yes.setOnClickListener {

         Toast.makeText(requireContext(),"AMount Sent", Toast.LENGTH_SHORT).show()
      }
      no.setOnClickListener {

         dismiss()
      }

   }

}