package com.example.udemyclone.ui.fragment

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.udemyclone.R
import com.example.udemyclone.data.entity.Filtreler
import com.example.udemyclone.data.entity.OgrenimIcerikleri
import com.example.udemyclone.databinding.FragmentOgrenimIcerigimBinding
import com.example.udemyclone.ui.adapter.FiltreAdapter
import com.example.udemyclone.ui.adapter.OgrenimIcerikleriAdapter


class OgrenimIcerigimFragment : Fragment() {
    private lateinit var binding: FragmentOgrenimIcerigimBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOgrenimIcerigimBinding.inflate(inflater, container, false)
        binding.recyclerViewOgrenim.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewFiltreler.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val ogrenimIcerikleriListesi = ArrayList<OgrenimIcerikleri>()
        val icerik1 = OgrenimIcerikleri(
            "Android Bootcamp Programı | Kotlin | 2023",
            "Kasım Adalan",
            "ders1",
            60
        )
        val icerik2 = OgrenimIcerikleri(
            "Android Mobil Uygulama İleri Seviye",
            "Atıl Samancıoğlu, Academy Club",
            "ders2",
            11
        )
        val icerik3 = OgrenimIcerikleri(
            "Android Mobil Uygulama Kursu: Kotlin & Java",
            "Atıl Samancıoğlu, Academy Club",
            "ders3",
            98
        )
        val icerik4 = OgrenimIcerikleri(
            "Python ile Sıfırdan Programlamaya Giriş",
            "Levent Ertunalılar",
            "ders4",
            74
        )
        val icerik5 =
            OgrenimIcerikleri("Kapsamlı Anndroid Programlama Eğitimi", "Murat Koç", "ders5", 5)
        val icerik6 = OgrenimIcerikleri(
            "Android Geliştiriciler İçin Kotlin Kursu",
            "Ali KAHRAMAN",
            "ders7",
            14
        )
        val icerik7 = OgrenimIcerikleri(
            "React Native ile Sıfırdan Mobile Uygulama Geliştirme",
            "Hasret Özkan",
            "ders6",
            10
        )


        ogrenimIcerikleriListesi.add(icerik1)
        ogrenimIcerikleriListesi.add(icerik2)
        ogrenimIcerikleriListesi.add(icerik3)
        ogrenimIcerikleriListesi.add(icerik4)
        ogrenimIcerikleriListesi.add(icerik5)
        ogrenimIcerikleriListesi.add(icerik6)
        ogrenimIcerikleriListesi.add(icerik7)
        val ogrenimIcerikleriAdapter =
            OgrenimIcerikleriAdapter(requireContext(), ogrenimIcerikleriListesi)
        binding.recyclerViewOgrenim.adapter = ogrenimIcerikleriAdapter

        val filtreListesi = ArrayList<Filtreler>()
        val filtre1 = Filtreler("Tümü")
        val filtre2 = Filtreler("İndirilen")
        val filtre3 = Filtreler("Arşivlenen")
        val filtre4 = Filtreler("Favorilere eklenenler")
        filtreListesi.add(filtre1)
        filtreListesi.add(filtre2)
        filtreListesi.add(filtre3)
        filtreListesi.add(filtre4)
        val filtrelerAdapter = FiltreAdapter(requireContext(), filtreListesi)
        binding.recyclerViewFiltreler.adapter = filtrelerAdapter



        return binding.root

    }
}