package com.example.udemyclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.udemyclone.data.entity.Filtreler
import com.example.udemyclone.data.entity.Kategoriler
import com.example.udemyclone.data.entity.Wishlist
import com.example.udemyclone.databinding.FragmentWishlistBinding
import com.example.udemyclone.ui.adapter.FiltreAdapter
import com.example.udemyclone.ui.adapter.WishlistAdapter
import com.example.udemyclone.ui.ogrenimIcerigim.adapter.KategoriAdapter


class WishlistFragment : Fragment() {
    private lateinit var binding: FragmentWishlistBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentWishlistBinding.inflate(inflater, container, false)

        binding.recyclerViewWishlist.layoutManager = LinearLayoutManager(requireContext())
        val istekListesi = ArrayList<Wishlist>()
        val istek1 = Wishlist(1,"IOS Bootcamp Programı | Swift | 2023","Kasım Adalan","istek1","4,4",4.4,20,"169,99")
        val istek2 = Wishlist(2,"Android Bootcamp Programı | Java | 2023","Kasım Adalan","istek2","5,0",5.0,2,"169,99")
        val istek3 = Wishlist(3,"Flutter Bootcamp Programı | Dart | 2023","Kasım Adalan","istek3","4,9",4.9,10,"169,99")
        val istek4 = Wishlist(4,"Flutter ile Uygulama Geliştirme Kursu | Android & IOS | 2023","Kasım Adalan","istek4","4,4",4.4,1248,"379,99")
        val istek5 = Wishlist(5,"Jetpack Compose ile Android Uygulama Geliştirme Kursu | 2023","Kasım Adalan","istek5","4.7",4.7,113,"329,99")
        val istek6 = Wishlist(6,"SwiftUI ile IOS Uygulama Geliştirme Eğitimi | Swift | 2023","Kasım Adalan","istek6","4,9",4.4,44,"349,99")
        val istek7 = Wishlist(7,"Android Mobil Uygulama Geliştirme Eğitimi | Kotlin | 2023","Kasım Adalan","istek7","4,8",4.8,678,"599,99")

        istekListesi.add(istek1)
        istekListesi.add(istek2)
        istekListesi.add(istek3)
        istekListesi.add(istek4)
        istekListesi.add(istek5)
        istekListesi.add(istek6)
        istekListesi.add(istek7)
        val isteklerAdapter = WishlistAdapter(requireContext(),istekListesi)
        binding.recyclerViewWishlist.adapter = isteklerAdapter
        return binding.root
    }
}