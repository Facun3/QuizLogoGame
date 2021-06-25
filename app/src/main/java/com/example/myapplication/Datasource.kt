package com.example.myapplication

class Datasource {

    fun loadLogos(): List<Logo> {
        return listOf(
            Logo("pepsi",R.drawable.pepsi),
            Logo("apple",R.drawable.apple),
            Logo("volkswagen",R.drawable.volkswagen),
            Logo("playstation", R.drawable.playstation),
            Logo("audi",R.drawable.audi),
            Logo("starbucks",R.drawable.starbucks),
            Logo("xbox",R.drawable.xbox),
            Logo("android",R.drawable.android_logo)
        )
    }
}