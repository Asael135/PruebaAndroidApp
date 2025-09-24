package com.example.app1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.app1.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {

    private var _binding: FirstFragmentBinding? = null
    private val binding get() = _binding!!  // acceso seguro al binding
    //OLVIDEN EL BINDING, O SI?

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FirstFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGoToSecondFragment.setOnClickListener {
            // Mostrar mensaje
            Toast.makeText(requireContext(), "Abriendo Login...", Toast.LENGTH_SHORT).show()

            // Lanzar Login Activity
            //Ya aprendi a lanzarlos arriba LADY GAGA
            val intent = Intent(requireContext(), Login::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
