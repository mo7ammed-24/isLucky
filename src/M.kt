fun main() {
    println(1230)
}

fun isLucky(n: Int): Boolean {
    var mystring=n.toString()
    var sum1=0
    var sum2=0
    var len=(mystring.length)
    var len1=(len/2)
    for(i in 0.rangeTo(len1-1))
        sum1+=mystring[i].toInt()
    for(i in len1.rangeTo(len-1))
        sum2+=mystring[i].toInt()

    if(sum1==sum2)
        return true
    else
        return false
}
