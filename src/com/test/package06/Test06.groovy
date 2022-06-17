def log(x, base = 10) {
    Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)

def printValue(a, b = 1, c = 2, d = 3, e = 4, f = 5) {
    println "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f = " + f
}

printValue(10)
printValue(10, 11, 12, 13)
printValue(10, 11, 12, 13)
printValue(10, 11, 12, 13, 14, 15)

def task(name, String[] details) {
    println "$name -- $details"
}

task('Call', '123-456-789')
task('Call', '123-456-789', '789-456-123')
task('Check Mail')