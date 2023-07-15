package controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.codeswag.R
import model.Category
import services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter : ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1,
        DataService.categories)
    }
}