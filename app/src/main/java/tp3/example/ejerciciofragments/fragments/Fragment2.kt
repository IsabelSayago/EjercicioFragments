package tp3.example.ejerciciofragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import tp3.example.ejerciciofragments.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Fragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    lateinit var btnChangeText : Button
    lateinit var v : View
    lateinit var textView : TextView
    var textChanged : String = "¡Hola!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_2, container, false)
        btnChangeText = v.findViewById(R.id.btnChangeText)
        textView = v.findViewById(R.id.textView)

        return v
    }

    override fun onStart() {
        super.onStart()

        btnChangeText.setOnClickListener {

            textView.setText(textChanged)
        }
    }
}