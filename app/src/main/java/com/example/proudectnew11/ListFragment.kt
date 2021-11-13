    package com.example.proudectnew11

    import android.os.Bundle
    import androidx.fragment.app.Fragment
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.recyclerview.widget.RecyclerView
    import com.example.proudectnew11.adabter.itemAdabter
    import com.example.proudectnew11.data.datasource
    import com.example.proudectnew11.databinding.FragmentListBinding
    import com.example.proudectnew11.model.product
    // هنا بدينا ننل الاشياء من المين لين هنا :
    class ListFragment : Fragment() { //بعد مانقلنا من المين  نعرف كل شي هنا ب val/var
        private var _binding: FragmentListBinding? = null // نعرف البايدنق قبل االفانكشن
        private val binding get() = _binding!! // عشان لا أحط استفهام عند كل فيو اعرفها
        lateinit var myDataset :List<product>
        lateinit var recyclerView :RecyclerView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            myDataset = datasource().loadProduct()

        }

        override fun onCreateView( // هنا انقل اي شي ماله علاقه في الفيو
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentListBinding.inflate(inflater, container, false) // هنا 3 ارقمنت اساسيه الي بين الاقواس
            val view = binding.root // يسحب كلشي
            return view // رجع الروت حق البايندق عشان استخدمهم هنا
        }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) { // هنا اقدر امسك واتعامل مع الفيو

            recyclerView = binding.recyclerView // هنا قدرت امسكها من الxml و احطها في قيمه
            recyclerView.adapter = itemAdabter(this.requireContext(),myDataset ) // في الفراقمينت اذا بوصل للكونتيكست استخدم ذي الفانكشين عشان اجيب الكونتيكست

            recyclerView.setHasFixedSize(true)
        }
    }
