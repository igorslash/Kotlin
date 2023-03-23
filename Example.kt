package Training

fun main() {
    val rectangle = Rectangle(5, 8, "red")
    rectangle.moveDown(4)

}
open class Figure(val color: String) {
    var x: Int = 0
    var y: Int = 0

    fun moveLeft(step: Int) {
        x += step
    }
    fun moeRight(step: Int) {
        y += step
    }
    fun moveDown(step: Int) {
        y += step
    }
    fun moveUp(step: Int) {
        y -= step
    }
}
class Rectangle(val with: Int, val height: Int, color: String): Figure(color) {
    fun area(): Int {
        return with * height
    }
    fun perimeter(): Int {
        return 2 *(with * height)
    }
}
class Round(val radius: Double, color: String): Figure(color) {
    fun area(): Double{
        return Math.PI * radius * radius
    }

    fun lenght():Double {
        return 2 * Math.PI * radius
    }
}