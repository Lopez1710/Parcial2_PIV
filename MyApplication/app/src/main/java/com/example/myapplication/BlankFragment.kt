package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class BlankFragment : Fragment() {

    var imagen = arrayOf(
        R.drawable.leon,
        R.drawable.elefante,
        R.drawable.tortuga
    )
    var especie = arrayListOf<String>("Leon","Elefante","Tortuga")
    var sexo = arrayListOf<String>("Macho","Macho","Embra")
    var habitad = arrayListOf<String>("Selva","Selva","Jungla")
    var animallista = arrayListOf<Animal>(
        Animal(imagen[0],especie[0], sexo[0],habitad[0]),
        Animal(imagen[1],especie[1], sexo[1],habitad[1]),
        Animal(imagen[2],especie[2], sexo[2],habitad[2]))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val imagen:ImageView = view.findViewById(R.id.imagen)
            val especie:TextView=view.findViewById(R.id.especie)
            val sexo:TextView=view.findViewById(R.id.sexo)
            val habitad:TextView=view.findViewById(R.id.habitad)

            imagen.setImageResource(animallista[getInt(ARG_OBJECT)].imagen)
            especie.text=animallista[getInt(ARG_OBJECT)].especie
            sexo.text=animallista[getInt(ARG_OBJECT)].sexo
            habitad.text=animallista[getInt(ARG_OBJECT)].habitad
        }


    }


    companion object {
        private const val ARG_OBJECT= "object"
    }
    }



