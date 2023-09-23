package com.example.udemyclone.ui.adapter

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.udemyclone.data.entity.Kategoriler
import com.example.udemyclone.databinding.KategoriItemBinding

class KategoriAdapter (var mContext : Context, var kategoriListesi : List<Kategoriler>)
    : RecyclerView.Adapter<KategoriAdapter.KategoriViewHolder>(){
        inner class KategoriViewHolder(var bindingKategori : KategoriItemBinding) : RecyclerView.ViewHolder(bindingKategori.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriViewHolder {
        val binding = KategoriItemBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return KategoriViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KategoriViewHolder, position: Int) {
        val kategori = kategoriListesi.get(position)
        val k = holder.bindingKategori
        k.kategoriAdi.text = kategori.kategoriAdi

    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }


}