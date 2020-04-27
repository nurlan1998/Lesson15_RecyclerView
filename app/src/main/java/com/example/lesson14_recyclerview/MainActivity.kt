package com.example.lesson14_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter: ListAdapter = ListAdapter(this)
    companion object{
//        var contacts: MutableList<User> = mutableListOf()
    }
    var count: Int =1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter

        data()

    }

    fun data(){
        val models: MutableList<User> = mutableListOf()
        for(i in 0 until 1){
            var user:User = User()
            user.title = "Title${i+1}"
            user.description = "Description${i+1}"
            models.add(user)
        }
        adapter.setData(models)
    }

    fun onItemClicked(user: User){
//        Toast.makeText(this,"${user.title} is Clicked",Toast.LENGTH_SHORT).show()

        count += user.count
        val models: MutableList<User> = mutableListOf()
        for (i in 0 until count) {
            val user:User = User()
            user.title = "Title${i + 1}"
            user.description = "Description${i + 1}"
            user.count += i
            models.add(user)
        }
        adapter.setData(models)

    }
}
