package com.example.westcutsbarbershop.data

import com.example.westcutsbarbershop.R

class BarbersDatasource {
    fun loadItems():List<Barbers>{
        return listOf<Barbers>(
            Barbers(R.string.pet1,R.string.type_pet1,R.string.age_pet1,R.drawable.dogo),
            Barbers(R.string.pet2,R.string.type_pet2,R.string.age_pet2,R.drawable.gato),
            Barbers(R.string.pet3,R.string.type_pet3,R.string.age_pet3,R.drawable.loro),

        )
    }
}