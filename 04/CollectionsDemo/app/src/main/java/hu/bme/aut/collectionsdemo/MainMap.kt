package hu.bme.aut.collectionsdemo

fun main() {
    val httpHeaders = mutableMapOf(
        "Authorization" to "your-api-key",
        "ContentType" to "application/json",
        "UserLocale" to "US")
    httpHeaders["Authorization"] = "something else"
    println(httpHeaders["Authorization"])
    httpHeaders.put("Hello", "World")
    println(httpHeaders)
    httpHeaders.forEach { key, value -> println("Value for key $key is $value") }
}
