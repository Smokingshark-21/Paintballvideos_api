package com.example.paintballvideosapi.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.paintballvideosapi.R
import com.example.paintballvideosapi.adapter.ItemAdapter
import com.example.paintballvideosapi.api.VideoViewmodel
import com.example.paintballvideosapi.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel: VideoViewmodel by activityViewModels()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.Videoinput(binding.editTextText.text.toString())
        viewModel.loadVideo(binding.editTextText.text.toString())

        viewModel.current.observe(viewLifecycleOwner){
        binding.videoRV.adapter = ItemAdapter(it.items)
        }
    }


}