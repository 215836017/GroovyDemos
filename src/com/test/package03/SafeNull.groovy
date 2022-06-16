package com.test.package03

def foo(str){
//    if(null != str){
//        str.reverse()
//    }
    str?.reverse()
}

println foo("aabb")
println foo(null)
