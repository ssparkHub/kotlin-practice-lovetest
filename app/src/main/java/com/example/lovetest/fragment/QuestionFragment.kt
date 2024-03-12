package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import com.example.lovetest.R.id.*

class QuestionFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        view.findViewById<ImageView>(btn_next2).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            btn_next2 -> {
                navController.navigate(action_questionFragment_to_selectionFragment)
            }
        }
    }





}