package com.didi.koskita.ui.expiration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.didi.koskita.R
import com.didi.koskita.databinding.FragmentExpirationBinding
import com.didi.koskita.databinding.FragmentSignInBinding


class ExpirationFragment : Fragment() {
    private var _binding: FragmentExpirationBinding? = null
    private val binding get() = _binding as FragmentExpirationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExpirationBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}