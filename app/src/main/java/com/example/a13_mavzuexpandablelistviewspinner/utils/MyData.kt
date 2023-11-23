package com.example.a13_mavzuexpandablelistviewspinner.utils
object MyData {
    val real  =  arrayListOf<String>("Modric", "Kross", "Benzema","Isko")
    val alNasr  =  arrayListOf<String>("Ronaldo", "Ronaldo2", "Ronaldo3")
    val barca  =  arrayListOf<String>("Messi", "Suarez", "Neymar")

    val map = HashMap<String, List<String>>()

    val titlelist = arrayListOf("real", "alNasr", "barsa")
    fun loadData(){
        map["real"] = real
        map["alNasr"] = alNasr
        map["barsa"] = barca
    }

}

