
package Kotlin101.Loops

fun main(args : Array<String>) {
    var presidents = array("jfk", "nixon", "carter")

    print("I love these presidents ")
    for (p in presidents) {
        print ("$p,")
    }

    println("")
    print("I loath these presidents ")
    var loop = presidents.size
    while (loop > 0) {
        loop--
        print("${presidents[loop]}, ")
    }

    println("")
    print("I puzzle these presidents ")
    var pool = presidents.size
    do {
        pool--
        print("${presidents[pool]}, ")
    }while(pool > 0)
}
