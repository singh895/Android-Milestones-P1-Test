/**
 * Saanvi Singh
 * Week 1 deliverable
 * Program to generate a triangle
 * 
 */
fun main() {
    generator(5)
    
}

fun generator(n: Int) : MutableList<String> {
    val mylist2 = mutableListOf<String>()
    
    for (i in 1..n){
        var mystring = ""
        for (j in 1..i){
            if (j <= i){
                mystring += "*"
            }
            else{
                mystring = " "
            }
        }
        mylist2.add(mystring)
        print(mystring+"\n")
        
	}
    return mylist2
}