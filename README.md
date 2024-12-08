# Kotlin map() Immutability Bug

This repository demonstrates a common error in Kotlin involving the immutability of the list returned by the `map()` function.

The `bug.kt` file shows the incorrect approach: attempting to directly modify the result of `map()`, which is immutable.  The `bugSolution.kt` file provides the correct approach: using a mutable list to allow modifications.

This example highlights the importance of understanding Kotlin's immutability features to avoid unexpected errors and runtime exceptions.