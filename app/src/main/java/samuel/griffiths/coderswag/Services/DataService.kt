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
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White Beanie", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")

    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "18", "shirt01"),
        Product("Devslopes Badge Light Grey", "20", "shirt02"),
        Product("Devslopes Logo Shirt Red", "22", "shirt03"),
        Product("Devslopes Hustle", "22", "shirt04"),
        Product("Kickflip Studios", "18", "shirt04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "28", "hoodie01"),
        Product("Devslopes Hoodie Red", "28", "hoodie02"),
        Product("Devslopes Grey Hoodie", "28", "hoodie03"),
        Product("Devslopes Black Hoodie", "28", "hoodie04")
    )


}
