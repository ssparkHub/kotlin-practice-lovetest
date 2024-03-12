package com.example.lovetest.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R

class ResultFragment : Fragment() {

    var option = -1


    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index") ?: -1

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        setResult(option, view)

        view.findViewById<ImageView>(R.id.btn_home).setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setResult(option: Int, view : View) {
        when (option) {
            1 -> {
                view.findViewById<TextView>(R.id.result_main).text = "You are a Quitter!!"
                view.findViewById<TextView>(R.id.result_sub).text = "You can let the person easily."
            }
            2 -> {
                view.findViewById<TextView>(R.id.result_main).text = "You should focus on yourself"
                view.findViewById<TextView>(R.id.result_sub).text = "You become really clingy to your ex."
            }
            3 -> {
                view.findViewById<TextView>(R.id.result_main).text = "You should take it easy"
                view.findViewById<TextView>(R.id.result_sub).text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                view.findViewById<TextView>(R.id.result_main).text = "You are pretty mature"
                view.findViewById<TextView>(R.id.result_sub).text = "You can easily accept the break-up"
            }
        }
    }


}