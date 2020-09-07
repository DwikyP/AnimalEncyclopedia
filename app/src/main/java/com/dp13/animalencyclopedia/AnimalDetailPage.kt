package com.dp13.animalencyclopedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class AnimalDetailPage : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_SCIENTIFIC_NAME = "extra_scientific_name"
        const val EXTRA_CLASS = "extra_class"
        const val EXTRA_ORDER = "extra_order"
        const val EXTRA_FAMILY = "extra_family"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_PHOTO = "extra_photo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_detail_page)

        var name: String?
        val imgAnimal: ImageView = findViewById(R.id.img_animal_photo)
        val tvScientificName: TextView = findViewById(R.id.tv_animal_scientific_name)
        val tvClass: TextView = findViewById(R.id.tv_animal_class)
        val tvOrder: TextView = findViewById(R.id.tv_animal_order)
        val tvFamily: TextView = findViewById(R.id.tv_animal_family)
        val tvDescription: TextView = findViewById(R.id.tv_animal_description)

        if(intent.extras != null){
            val animalData = intent.extras
            if (animalData != null) {
                name = animalData.getString(EXTRA_NAME)
                tvScientificName.text = animalData.getString(EXTRA_SCIENTIFIC_NAME)
                tvClass.text = animalData.getString(EXTRA_ORDER)
                tvOrder.text = animalData.getString(EXTRA_ORDER)
                tvFamily.text = animalData.getString(EXTRA_FAMILY)
                tvDescription.text = animalData.getString(EXTRA_DESCRIPTION)
                Glide.with(this)
                    .load(animalData.getInt(EXTRA_PHOTO))
                    .into(imgAnimal)

                supportActionBar?.title = name
            }
        }

    }
}