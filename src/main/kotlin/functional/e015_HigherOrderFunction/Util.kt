package functional.e015_HigherOrderFunction

fun <T> filter(collection: Collection<T>, predicate: (T) -> Boolean): List<T> {
    val destination = ArrayList<T>()

    for (element in collection)
        if (predicate(element))
            destination.add(element)

    return destination
}

fun <T, R> map(collection: Collection<T>, transform: (T) -> R): List<R> {
    val result = ArrayList<R>()

    for (element in collection)
        result.add(transform(element))

    return result
}