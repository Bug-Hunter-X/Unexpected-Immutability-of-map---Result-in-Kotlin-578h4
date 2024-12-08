```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    // Correct approach: Create a mutable list
    val doubledList2 = list.map { it * 2 }.toMutableList() 
    doubledList2.add(6)
    println(doubledList2) 
}
```