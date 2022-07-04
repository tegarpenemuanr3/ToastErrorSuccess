package com.tegarpenemuan.toasterrorsuccess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tegarpenemuan.toasterrorsuccess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnError.setOnClickListener {
            val toast = Toast(this)
            toast.duration = Toast.LENGTH_SHORT
            val customView: View = layoutInflater.inflate(R.layout.toast_error, null)
            toast.view = customView
            toast.show()
        }

        binding.btnSuccess.setOnClickListener {
            val toast = Toast(this)
            toast.duration = Toast.LENGTH_SHORT
            val customView: View = layoutInflater.inflate(R.layout.toast_success, null)
            toast.view = customView
            toast.show()
        }
    }
}

/** info toast.view / toast.setView deprecated
 * https://developer.android.com/reference/android/widget/Toast#makeText(android.content.Context,%20java.lang.CharSequence,%20int)
 * */