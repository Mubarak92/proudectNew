package com.example.proudectnew11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proudectnew11.databinding.FragmentListBinding
import com.example.proudectnew11.databinding.FragmentNameBinding

//نقلناها من ال كلاس ال buy لين هنا
class nameFragment : Fragment() {
    companion object{
        const val  prod ="pro1"
    }
    lateinit var proudectName : String
    private var _binding: FragmentNameBinding? = null // هنا ما انسى البرايفت
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNameBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {

            binding.textView2.text = it.getString("phoneName").toString()
          //  proudectName = it.getString(prod).toString() // جايني  ارقمنت راح اخزنه في المتغير بروديكت نيم ذا و كيف اعرفه راح اعرفه بالكي حقه  الي بين القوسين " جيبي الفاليو الي في الكي " من فراقمنت الليسيت
        }

    //    binding.textView2.text = it // اخذناها من بروديكت نيم الي فوق و حطيناها بعد اليساوي عشان عشان يعبي التيكست الي الاكس ام ال
    }

       }
