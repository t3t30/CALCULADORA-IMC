package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
         * recuperar componentes edittext altura e peso
         * peso/(altura*altura)=resultado
         * pegar resultado, comparar tabela
         * mostrar classificação
         */
        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btncalcular = findViewById<Button>(R.id.btn_calcular)
        btncalcular.setOnClickListener {


            val pesostr: String = edtpeso.text .toString()
            val alturastr: String = edtaltura.text .toString()
            if (pesostr == "" || alturastr == "" ){
                // mostrar msg para usuario
                Snackbar
                    .make(
                        edtpeso, "Preencha todos os campos",
                    Snackbar.LENGTH_LONG

                    )
                    .show()
            } else {
                val peso: Float = pesostr.toFloat()
                val altura: Float = alturastr .toFloat()
                val resultado = peso / (altura * altura)
                println(resultado)
            }



        }
    }
}