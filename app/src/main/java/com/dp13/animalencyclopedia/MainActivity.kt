package com.dp13.animalencyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAnimals: RecyclerView
    private var list: ArrayList<Animal> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Animal Encyclopedia"

        rvAnimals = findViewById(R.id.rv_animals)
        rvAnimals.setHasFixedSize(true)

        list.addAll(AnimalsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_aboutme -> {
                val moveAboutMe = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(moveAboutMe)
            }
        }
        }

    private fun showRecyclerList(){
        rvAnimals.layoutManager = LinearLayoutManager(this)
        val listAnimalAdapter = ListAnimalAdapter(list)
        rvAnimals.adapter = listAnimalAdapter

        listAnimalAdapter.setOnItemClickCallback(object: ListAnimalAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Animal) {
                showSelectedAnimal(data)
            }
        })
    }

    private fun showSelectedAnimal(animal: Animal){
        val animalData = Bundle()
        animalData.putString(AnimalDetailPage.EXTRA_NAME, animal.name)
        animalData.putString(AnimalDetailPage.EXTRA_SCIENTIFIC_NAME, animal.scientificName)
        animalData.putString(AnimalDetailPage.EXTRA_CLASS, animal.animalClass)
        animalData.putString(AnimalDetailPage.EXTRA_ORDER, animal.Order)
        animalData.putString(AnimalDetailPage.EXTRA_FAMILY, animal.Family)
        animalData.putString(AnimalDetailPage.EXTRA_DESCRIPTION, animal.description)
        animalData.putInt(AnimalDetailPage.EXTRA_PHOTO, animal.photo)

        val moveDataIntent = Intent(this@MainActivity, AnimalDetailPage::class.java)
        moveDataIntent.putExtras(animalData)
        startActivity(moveDataIntent)
    }


}