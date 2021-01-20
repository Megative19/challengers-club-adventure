import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    var distanceA = 0;
       var distanceB = 0;
       
       if(z>x){
            distanceA =z-x;
       }else{
           distanceA=x-z;
       }
       
       if(z>y){
           distanceB = z-y;
       }else{
           distanceB= y-z;
       }
       
       if(distanceA<distanceB){
           return "Cat A";
       }else if(distanceB<distanceA){
           return "Cat B";
       }
       else{
           return "Mouse C";
       }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
