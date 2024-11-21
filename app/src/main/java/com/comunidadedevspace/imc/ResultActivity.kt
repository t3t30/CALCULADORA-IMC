package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

               //chave recuperação outra tela
           val result = intent.getFloatExtra("123", 0f)

        val tvresult= findViewById<TextView>(R.id. tv_result)
        val tvclassificacao= findViewById<TextView>(R.id. tv_classificação)

        tvresult.text = result.toString()

        var classificacao: String?=null
        if(result < 18.5 ){ classificacao = "ABAIXO DO PESO"}
        else if (result >= 18.5 && result < 25.0) { classificacao = "NORMAL"}
        else if (result >= 25.0 && result < 35.0) { classificacao = "OBESIDADE CLASSE I"}
        else if (result >= 35.0 && result < 40.0) { classificacao = "OBESIDADE CLASSE II"}
        else { classificacao = "OBESIDADE CLASSE III"}

              tvclassificacao.text = classificacao


        }
    }
