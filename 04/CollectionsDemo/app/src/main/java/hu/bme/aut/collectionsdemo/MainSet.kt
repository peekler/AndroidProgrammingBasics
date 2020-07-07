package hu.bme.aut.collectionsdemo

data class Worker(
    val id: Int,
    val name: String
)

fun main() {
    val workers = mutableSetOf(
        Worker(id = 5, name = "Susan"),
        Worker(id = 3, name = "Mike"),
        Worker(id = 5, name = "Joe"),
        Worker(id = 4, name = "Susan")
    )
    println(workers) // [Worker(id=5, name=Susan), Worker(id=3, name=Mike), Worker(id=5, name=Joe), Worker(id=4, name=Susan)]
    val removedWorker = Worker(id = 5, name="Joe")
    workers.remove(removedWorker)
    println(workers) // [Worker(id=5, name=Susan), Worker(id=3, name=Mike), Worker(id=4, name=Susan)]
}
