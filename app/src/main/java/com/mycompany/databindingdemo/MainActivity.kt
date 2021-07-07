package com.mycompany.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.mycompany.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson :Person = Person(  "Ali ","123","ali@gamail.com","address ali")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //MUSt ennter this then common then it works

        binding.personData = aPerson

        /*
        binding.tvName.text = aPerson.name
        binding.tvIC.text = aPerson.ic
        binding.tvEmail.text = aPerson.email
        binding.tvAddress.text = aPerson.address
        */

         binding.btnUpdate.setOnClickListener(){
             aPerson.email = "abu@gamil.com"
             aPerson.address = "address abu"
             binding.apply { invalidateAll() } //Validate All and Test All the Result
         }
    }
}