package com.example.udemyclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.udemyclone.R
import com.example.udemyclone.data.entity.Filtreler
import com.example.udemyclone.databinding.FiltrelerRowBinding


class FiltreAdapter (var mContext : Context, var filtreListesi : List<Filtreler>)
    : RecyclerView.Adapter<FiltreAdapter.FiltreViewHolder>(){
    inner class FiltreViewHolder(var bindingFiltre : FiltrelerRowBinding) : RecyclerView.ViewHolder(bindingFiltre.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FiltreViewHolder {
        val binding = FiltrelerRowBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return FiltreViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FiltreViewHolder, position: Int) {
        val filtreler = filtreListesi.get(position)
        val f = holder.bindingFiltre
        f.filtreAdi.text = filtreler.filtreAdi
        if (filtreler.filtreAdi == "Tümü") {
            f.filtreAdi.setBackgroundResource(R.drawable.selected_item)
            f.filtreAdi.setTextColor(ContextCompat.getColor(mContext, R.color.textColor))
        }
    }

    override fun getItemCount(): Int {
        return filtreListesi.size
    }


}