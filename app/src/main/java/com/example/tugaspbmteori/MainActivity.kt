package com.example.tugaspbmteori
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    var menu = arrayOf("Nasi Goreng", "Nasi Ayam","Nasi Pecel")
    var spinner: Spinner? = null
    var textView_msg: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_msg = this.msg

        spinner = this.spinner_sample
        spinner!!.setOnItemSelectedListener(this)

        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, menu)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner!!.setAdapter(aa)

    }
    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        textView_msg!!.text = "Kamu Memesan : "+menu[position]
    }
    override fun onNothingSelected(arg0: AdapterView<*>) {

    }
}
