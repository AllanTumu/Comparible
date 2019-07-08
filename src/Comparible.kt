import java.util.*

fun main (args:Array<String>){
    var names = ArrayList<String>()
    names.add("Zuckerberg")
    names.add("Haggai")
    names.add("Allan")
    names.add("Kirk")
    names.add("Nick")
    for (element in names){
        println(element)
    }
    println("-------After Sort------")
    Collections.sort(names)
    for (element in names){
        println(element)
    }
}