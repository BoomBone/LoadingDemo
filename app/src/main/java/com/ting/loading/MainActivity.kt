package com.ting.loading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var loadingDialog :LoadingDialog
    val handler:Handler = Handler{
        if (loadingDialog.isShowing){
            loadingDialog.dismiss()
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadingDialog = LoadingDialog(this)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            loadingDialog.show()
            handler.sendEmptyMessageDelayed(1,6000)
        }
    }
}
