package com.viewhotel.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerView.layoutManager = LinearLayoutManager( this)
        recyclerView.adapter = adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.hotelView)

        var data = ArrayList<Hotel>()
        data.add(Hotel(R.drawable.hotel7, "Four Seasons Resort Bali", "Jimbaran Bay Jimbaran"))
        data.add(Hotel(R.drawable.hotel8, "Jumana Bali Ungasan", "Jl. Melasti, Banjar Kelod Ungasan Uluwatu"))
        data.add(Hotel(R.drawable.hotel9, "Padma Resort Legian", "Jln. Padma No.1 PO BOX 1107 TBB Legian"))
        data.add(Hotel(R.drawable.hotel10, "The St. Regis Bali Resort", "Kawasan Pariwisata Nusa Dua Lot S6 PO BOX 44 Nusa Dua"))
        data.add(Hotel(R.drawable.hotel11, "Fairmont Jakarta", "Jl. Asia Afrika No. 8, Gelora Bung Karno Jakarta"))
        data.add(Hotel(R.drawable.hotel12, "Hotel Borobudur Jakarta", "Jalan Lapangan Benteng Selatan No. 1 Jakarta"))
        data.add(Hotel(R.drawable.hotel3, "Grand Rohan Yogyakarta", "Jl. Suryotomo No. 31 Yogyakarta"))
        data.add(Hotel(R.drawable.hotel4, "Sheraton Mustika Yogyakarta Resort and Spa", "Jl. Laksda Adisucipto Km.8,7 Yogyakarta"))

        adapter = MyAdapter(data)
    }
}
