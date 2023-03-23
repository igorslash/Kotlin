package Training

fun main() {
    val array = arrayOf(1, 3, 6, 7, 5)
    val array1 = arrayOfNulls<Int?>(10)//Возвращает массив объектов заданного типа заданного размера
    //инициализируется нулевыми значениями.
    array1[1]
    array1[2]
    array[3] = 12
    println(array1[1])

    val list: List<Int> = ArrayList()
    val list1: MutableList<Int> = ArrayList()//MutableList изменяемый лист
    list1.add(2)
    list1.add(3)
    println(list1)
}