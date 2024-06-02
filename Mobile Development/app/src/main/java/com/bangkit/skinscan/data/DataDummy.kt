package com.bangkit.skinscan.data

import com.bangkit.skinscan.R

object DataDummy {
    fun generateDummyDiseaseResponse(): List<SkinDisease>{
        val items: MutableList<SkinDisease> = arrayListOf()
        for (i in 0..12){
            val disease = SkinDisease(
                "nama penyakit + $i",
                "deskripsi + $i",
                R.drawable.ic_launcher_foreground
            )
            items.add(disease)
        }
        return items
    }
}