package com.example.olympic_tokyo

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB:ViewBinding>:AppCompatActivity(){
    abstract val LOG_TAG: String
    abstract val bindingInflater:(LayoutInflater)-> VB
    private var _binding: ViewBinding? = null
    protected val binding = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        setup()
        addCallback()

    }
    abstract fun setup()
    abstract fun addCallback()

    protected fun log(value: String){
        Log.v(LOG_TAG, value)

    }
}