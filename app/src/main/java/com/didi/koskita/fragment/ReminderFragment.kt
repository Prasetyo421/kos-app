package com.didi.koskita.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.didi.koskita.R
import com.didi.koskita.adapter.ReminderAdapter
import com.didi.koskita.databinding.FragmentReminderBinding


class ReminderFragment : Fragment() {
    private var _binding: FragmentReminderBinding? = null
    private val binding get() = _binding as FragmentReminderBinding
    lateinit var reminderAdapter: ReminderAdapter
    lateinit private var listItem: List<String>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listItem = listOf(
            "Parkir Kendaraan",
            "Buang sampah",
            "Bersih bersih",
            "Iuran Kebersihan",
            "Token Listrik"
        )

        reminderAdapter = ReminderAdapter(listItem)
        binding.rvReminder.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        binding.rvReminder.setHasFixedSize(true)
        binding.rvReminder.adapter = reminderAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReminderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

//    companion object {
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            ReminderFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}