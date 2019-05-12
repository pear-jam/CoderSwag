package samuel.griffiths.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import samuel.griffiths.coderswag.R

import kotlinx.android.synthetic.main.activity_products.*
import samuel.griffiths.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }

}
