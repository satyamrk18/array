// fun main()
// {
//     println("git new changes")
    
// }
// fun satyam(){
//     val s:Int= 10
//     println(s)
    
// }
//arrays:- object that stores multiple values of same type
// arrays has fixed size,length is fixed
//syntax var arr = arrayOf("satyam","shivam","pratik")
//indexing starts with 0
//0th index = satyam
//1st index = shivam
//2nd index = pratik
fun main()
{
    var arr = arrayOf(1,2,3,4,5,)//implicit array
    var arr1 = arrayOf("satyam","shivam","pratik")//implicit aaray
    var arr2 = arrayOf<Int>(1,2,3,4,5,6,)//explicit array
//    for( i in arr)
//        println(i)
//    for (i in arr1)
//        println(i)
//    for ( i in arr2)
//        println(i)
//    for((i,e)in arr.withIndex())//to print with index
//    {
//        println("$i-$e")
//    }
//    println(arr[0])// to access particuler element the index is given
//    arr.set(1,8)//to modify the array value
//    println(arr[1])
   // println(arr.size)//to determine the size of array
for ( i in arr)
    println(i)
    for ( (i,e)in arr.withIndex())
        println("$i-$e")
 }