package controller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.codeswag.R
import controlAdapter.CategoryAdapter
import services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories
        )
        val categorylistview: ListView = findViewById(R.id.categorieslistview)
        categorylistview.adapter= adapter
        categorylistview.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }
    }
}