package br.com.tlmacedo.agenda

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import java.util.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alunos: List<String> = Arrays.asList("Alex","Fran","Jose", "Maria","Ana")
        var listaDeAlunos: ListView = findViewById(R.id.activity_main_lista_de_alunos)
        listaDeAlunos.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos)



    }


}