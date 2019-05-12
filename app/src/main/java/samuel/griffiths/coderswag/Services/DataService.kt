package samuel.griffiths.coderswag.Services

import samuel.griffiths.coderswag.Model.Category
import samuel.griffiths.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White Beanie", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")

    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "18", "shirt1"),
        Product("Devslopes Badge Light Grey", "20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "22", "shirt3"),
        Product("Devslopes Hustle", "22", "shirt4"),
        Product("Kickflip Studios", "18", "shirt4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "28", "hoodie1"),
        Product("Devslopes Hoodie Red", "28", "hoodie2"),
        Product("Devslopes Grey Hoodie", "28", "hoodie3"),
        Product("Devslopes Black Hoodie", "28", "hoodie4")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product>{

        return when(category){
            "SHIRTS" -> shirts
            "Hats" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}
