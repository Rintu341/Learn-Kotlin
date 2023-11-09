import  java.util.ArrayList

fun main() {

    var x = 90;
}

fun ReverseBit(x:Long):Long
{
    var p = x;
    var arr = ArrayList<Int>(32)
    var result:Long = 0
    var i = 0;
    var bit:Int = 31;
     while(p > 0)
     {
         arr[i] = (p%2).toInt();
         p = p/2;
         i++;
     }
    for(i in arr)
        result += i*p
    return x;
}
