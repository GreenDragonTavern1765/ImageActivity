package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {

    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<PhotoObject>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext,4)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter
        fillDataList()
        photoAdapter.setDataList(dataList)
    }

    fun fillDataList() {
        dataList.add(PhotoObject("Arryn","The Eyrie", R.drawable.arryn))
        dataList.add(PhotoObject("Baratheon","Storm's End", R.drawable.baratheon))
        dataList.add(PhotoObject("Frey","The Twins", R.drawable.frey))
        dataList.add(PhotoObject("Greyjoy","Iron Islands", R.drawable.greyjoy))
        dataList.add(PhotoObject("Lannister","Casterly Rock", R.drawable.lannister))
        dataList.add(PhotoObject("Martell","Dorne", R.drawable.martell))
        dataList.add(PhotoObject("Mormont","Bear Island", R.drawable.mormont))
        dataList.add(PhotoObject("Stark","Winterfell", R.drawable.stark))
        dataList.add(PhotoObject("Targaryen","Dragonstone", R.drawable.targaryen))
        dataList.add(PhotoObject("Tarly","Horn Hill", R.drawable.tarly))
        dataList.add(PhotoObject("Tully","Riverrun", R.drawable.tully))
        dataList.add(PhotoObject("Tyrell","Highgarden", R.drawable.tyrell))

    }

    fun onListItemClick(position : Int) {

    }
}