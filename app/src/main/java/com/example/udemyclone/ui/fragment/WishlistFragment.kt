package com.example.udemyclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.udemyclone.data.entity.Kategoriler
import com.example.udemyclone.databinding.FragmentWishlistBinding
import com.example.udemyclone.ui.adapter.KategoriAdapter


class WishlistFragment : Fragment() {
    private lateinit var binding: FragmentWishlistBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWishlistBinding.inflate(inflater, container, false)
        binding.kategoriRecyclerview.layoutManager = LinearLayoutManager(requireContext())

        val kategorilerListesi = ArrayList<Kategoriler>()
        val k1 = Kategoriler("Yazılım Geliştirme")
        val k2 = Kategoriler("BT ve Yazılım")
        val k3 = Kategoriler("İşletme")
        val k4 = Kategoriler("Finans ve Muhasebe")
        val k5 = Kategoriler("Ofiste Verimlilik")
        val k6 = Kategoriler("Kişisel Gelişim")
        val k7 = Kategoriler("Tasarım")
        val k8 = Kategoriler("Pazarlama")
        val k9 = Kategoriler("Yaşam Tarzı")
        val k10 = Kategoriler("Fotoğraf ve Video")
        val k11 = Kategoriler("Sağlık ve Fitness")
        val k12 = Kategoriler("Müzik")
        val k13 = Kategoriler("Öğretim ve Akademi")

        kategorilerListesi.add(k1)
        kategorilerListesi.add(k2)
        kategorilerListesi.add(k3)
        kategorilerListesi.add(k4)
        kategorilerListesi.add(k5)
        kategorilerListesi.add(k6)
        kategorilerListesi.add(k7)
        kategorilerListesi.add(k8)
        kategorilerListesi.add(k9)
        kategorilerListesi.add(k10)
        kategorilerListesi.add(k11)
        kategorilerListesi.add(k12)
        kategorilerListesi.add(k13)
        val kategorilerAdapter = KategoriAdapter(requireContext(),kategorilerListesi)
        binding.kategoriRecyclerview.adapter = kategorilerAdapter
        return binding.root
    }
}