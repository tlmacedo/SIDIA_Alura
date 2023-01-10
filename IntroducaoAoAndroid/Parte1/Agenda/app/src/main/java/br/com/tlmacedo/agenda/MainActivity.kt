package br.com.tlmacedo.agenda

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alunos: List<String> = Arrays.asList("Alex","Fran","Jose")
        var primeiroAluno: TextView = findViewById(R.id.textView)
        var segundoAluno: TextView = findViewById(R.id.textView2)
        var terceiroAluno: TextView = findViewById(R.id.textView3)

        primeiroAluno.setText(alunos.get(0))
        segundoAluno.setText(alunos.get(1))
        terceiroAluno.setText(alunos.get(2))


    }


}