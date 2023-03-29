//an ordered collection
//mutable or immutable
//can add or remove element in a list

fun main() {

//    val fruits= listOf("banana","apple","mango","avocado")
//    println(fruits)
//
//    val zamunda= mutableListOf(1250000,"Alfavo",true,20.6,34.5f)
//
//    fruits.add("watermelon")
//
//    zamunda.add("constitituonal Monarchy")
//    zamunda.remove(34.5f)
//    println(zamunda)

    val number= mutableListOf(23,45,68,90,12,56,32)
    println(number.count())
    println(number.max())
    println(number.min())
    println(number.sum())
    println(number.average())
    println(number.get(4))
    println(number.reversed())
    println(number.indexOf(23))
    println(number.lastIndexOf(56))
    println(number.lastIndex)
    println(number.sorted())
    number.sort()

   hope(listOf(1,2,3,4,5))



//    val kiwi=Product("Kiwi", 100.0)
//    println("Kiwi" is Product)

    createProductList()
    food()



}
//write a function that sums up all the elements in a list of integers
//Do not use the inbuilt .sum()

fun hope(list: List<Int>) {
    var sum = 0
    for (element in list) {
        sum += element
    }
println(sum)
}

data class Product(var name: String,var price:Double)

fun createProductList(){
val prod1=Product("Iphone",120000.0)
val switch=Product("switch",500.0)
val prod2=Product("mango",50.0)
val shoe=Product("Adidas",3500.0)

val products= listOf(prod1,switch,prod2,shoe)


    println(products)

    val come=products.sortedByDescending { product -> product.name }
    println(come)
    val go=products.filter { product ->  product.price<=5000 }
    println(go)
}
//print the even numbers in the list below
fun food(){
    val num= listOf(12,17,31,54,67,89,21,34,56)
    var count=0
    for (x in num){
        if (x%2==0){
            count+=x
        }
        println(count)
    }
//option2
    val evenNum=num.filter { num->num%2==0 }
    println(evenNum)
}

