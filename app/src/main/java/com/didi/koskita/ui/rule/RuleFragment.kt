package com.didi.koskita.ui.rule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.didi.koskita.adapter.RuleAdapter
import com.didi.koskita.databinding.FragmentRuleBinding

class RuleFragment : Fragment() {

    private lateinit var slideshowViewModel: RuleViewModel
    private var _binding: FragmentRuleBinding? = null
    lateinit var adapterRule: RuleAdapter
    lateinit var listItem: List<String>

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding as FragmentRuleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        slideshowViewModel =
            ViewModelProvider(this).get(RuleViewModel::class.java)

        _binding = FragmentRuleBinding.inflate(inflater, container, false)
        val root: View = binding.root

        listItem = listOf(
            "Dilarang membawa minuman keras ke kos",
            "Selalu menjaga kebersihan",
            "Selalu menjaga kerukunan",
            "Selalu menutup pintu gerbang"
        )

        adapterRule = RuleAdapter(listItem)
        with(binding){
            rvRules.layoutManager = LinearLayoutManager(context)
            rvRules.setHasFixedSize(true)
            rvRules.adapter = adapterRule
        }

//        val textView: TextView = binding.textSlideshow
//        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}