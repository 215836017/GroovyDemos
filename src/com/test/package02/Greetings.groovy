package com.test.package02

// ---- 第1种 -------
//public class Greetings {
//    static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            System.out.print "hi "
//        }
//        System.out.println("Groovy3");
//    }
//}

// ---- 第2种 -------
//for (int i = 0; i < 3; i++) {
//    System.out.print "hi "
//}
//System.out.println("Groovy3")


// ---- 第3种 -------
//for (i in 0..2) {
//    print 'hi '
//}
//println "Groovy3"

// ---- 第4种 -------
//0.upto(2){
//    print "hi $it, "
//}
//println "Groovy3"

// ---- 第5种 -------
//3.times {
//    print "hi $it, "
//}
//println "Groovy3"

// ---- 第6种 -------
0.step(10, 2){
    print "hi $it, "
}