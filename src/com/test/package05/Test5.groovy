class Robot {
    def type, height, width

    def access(location, weight, fragile) {
        println "Received fragile? $fragile,weigth: $weight, loc: $location"
    }
}

robot = new Robot(type: "arm", width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"

robot.access(10, 50, true)
robot.access(x:30, y:20, z:10, 50, true)
robot.access(50, true, x:300, y:200)
