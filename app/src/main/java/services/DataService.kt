package services

import model.Category
import model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        Product("Devslopes Graphics Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20","hat02"),
        Product("Devslopes Hat White", "$19", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
        Product("Devslopes Hoodie Red", "$32","hoodie02"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie03"),
        Product("Devslopes Black Hoodie", "$32", "hoodie04")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black", "$28", "shirt01"),
        Product("Devslopes Badge Light Gray", "$32","shirt02"),
        Product("Devslopes Logo Shirt Red", "$28", "shirt03"),
        Product("Devslopes Hustle", "$32", "shirt04"),
        Product("Kickflip Studios", "18", "shirt05")
    )
}