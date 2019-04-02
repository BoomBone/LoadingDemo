package com.ting.loading

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log

class LoadingDialog(context: Context) : Dialog(context) {
//    init {
//        window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        setContentView(R.layout.dialog_loading)
//        setCanceledOnTouchOutside(false)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val windowManager = window?.windowManager
        window.setDimAmount(0f)
        val width = windowManager?.defaultDisplay?.width
        val attributes = window?.attributes;

        //设置窗口透明度
//        attributes?.alpha = 0f
        //设置窗口宽高为屏幕1/3
        val showWidth = width!! / 3
        Log.e("main", "width=$width,showWidth=$showWidth")

        attributes?.width = showWidth
        attributes?.height = showWidth

        window?.attributes = attributes
        setContentView(R.layout.dialog_loading)

        setCancelable(false)

    }
}