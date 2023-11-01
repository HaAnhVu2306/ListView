package com.example.baitaplistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailList = arrayListOf <Email>()
            emailList.add(Email("Subject 1", "Description 1", "06:05 AM", R.mipmap.iconthumbnail))
            emailList.add(Email("Subject 2", "Description 2", "07:56 AM", R.mipmap.iconthumbnail) )
            emailList.add(Email("Subject 3", "Description 3", "08:45 AM", R.mipmap.iconthumbnail))
            emailList.add(Email("Subject 4", "Description 4", "09:45 AM", R.mipmap.iconthumbnail))
            emailList.add(Email("Subject 5", "Description 5", "10:45 AM", R.mipmap.iconthumbnail))
            emailList.add(Email("Subject 6", "Description 6", "11:45 AM", R.mipmap.iconthumbnail))
            emailList.add(Email("Subject 7", "Description 7", "12:45 PM", R.mipmap.iconthumbnail))
            emailList.add(Email("Subject 8", "Description 8", "15:00 PM", R.mipmap.iconthumbnail))
            emailList.add(Email("Subject 9", "Description 9", "20:55 PM", R.mipmap.iconthumbnail))
            emailList.add(Email("Subject 10", "Description 10", "22:45 PM", R.mipmap.iconthumbnail))

        val adapter = item_adapter(emailList)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter

    }
    data class Email(
        val subject: String,
        val description: String,
        val time: String,
        val iconthumbnail: Int
    )

}