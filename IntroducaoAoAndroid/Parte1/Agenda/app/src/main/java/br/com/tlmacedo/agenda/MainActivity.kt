package br.com.tlmacedo.agenda

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Thiago Macedo", Toast.LENGTH_LONG).show()
    }
}