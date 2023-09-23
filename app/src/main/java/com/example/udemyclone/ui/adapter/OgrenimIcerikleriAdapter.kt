package com.example.udemyclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.udemyclone.data.entity.OgrenimIcerikleri
import com.example.udemyclone.databinding.KategoriItemBinding
import com.example.udemyclone.databinding.OgrenimIcerigiRowBinding

class OgrenimIcerikleriAdapter(var mContext : Context, var ogrenimIcerikleriListesi : List<OgrenimIcerikleri>)
: RecyclerView.Adapter<OgrenimIcerikleriAdapter.OgrenimViewHolder>(){
    inner class OgrenimViewHolder (var bindingOgrenimIcerigiRowBinding: OgrenimIcerigiRowBinding ) : RecyclerView.ViewHolder(bindingOgrenimIcerigiRowBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OgrenimViewHolder {
        val binding = OgrenimIcerigiRowBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return OgrenimViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OgrenimViewHolder, position: Int) {
        val ogrenim = ogrenimIcerikleriListesi.get(position)
        val i = holder.bindingOgrenimIcerigiRowBinding
        i.textViewEgitimAdi.text = ogrenim.egitimAdi
        i.textViewEgitimciAdi.text = ogrenim.egitimciAdi
        i.textViewOran.text = "${ogrenim.izlemeOrani}% tamamlandı"
        i.progressBar.progress = ogrenim.izlemeOrani
        i.imageViewEgitim.setImageResource(mContext.resources.getIdentifier(ogrenim.imageEgitim,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return ogrenimIcerikleriListesi.size
    }


}