//ABC192_B lowerupper

##################################################

fun main(args: Array<String>) {
    val s = readLine()!!
    if(s.indices.all { if(it % 2 == 0) s[it] in ('a'..'z') else s[it] in ('A'..'Z') }) {
        println("Yes")
    } else {
        println("No")
    }
}

##################################################

fun main() {
    val s = readLine()!!
    var flag = false
    if (!s[0].isLowerCase()) {
        flag = true
    }
    
    for (i in 1 until s.length) {
        if (i % 2 == 0) {
            if (!s[i].isLowerCase()) flag = true
        } else {
            if (!s[i].isUpperCase()) flag = true
        }
    }
    
    if (!flag) println("Yes") else println("No")
}

##################################################

import java.util.*
import kotlin.math.*

fun main(args: Array<String>){
  val X = readLine()!!
  val len = X.length
  val oddIsLowerCase: Boolean = (0 until len step 2).all{X[it].isLowerCase()}
  val evenIsUpperCase: Boolean = (1 until len step 2).all{X[it].isUpperCase()}
  if(oddIsLowerCase && evenIsUpperCase)println("Yes") else println("No")
  
}

##################################################

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val S = scanner.next()
    var U = ""
    var L = ""
    var U2 = ""
    var L2 = ""
    val n = S.length

    for (i in 0 until n) {
        if (i % 2 == 0) {
            L += S[i]
            L2 += S[i].toLowerCase()
        } else {
            U += S[i]
            U2 += S[i].toUpperCase()
        }
    }

    if (U == U2 && L == L2) {
        println("Yes")
    } else {
        println("No")
    }
}
##################################################
