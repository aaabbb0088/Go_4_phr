package com.tonychuang.go_4_phr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tabs.*

class TabsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabs)

        BTN_Cards.setOnClickListener(BTNAction())
        BTN_AddCard.setOnClickListener(BTNAction())
        BTN_MainAcc.setOnClickListener(BTNAction())
    }

    fun BTNAction(): View.OnClickListener {
        return View.OnClickListener {
            when (it) {
                BTN_Cards -> {
                    Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
                }
                BTN_AddCard -> {
                    Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
                }
                BTN_MainAcc -> {
                    Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
