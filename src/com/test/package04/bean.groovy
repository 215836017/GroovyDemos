class Car {
    def miles
//    int miles
    final year

    Car(year) {
        this.year = year
    }
}

Car car = new Car(2022)
println "Year: $car.year"
println "Miles: $car.miles"
car.miles = 20
println "Miles: $car.miles"