package projectEuler.p024_LexicographicPermutations

/**
 * A permutation is an ordered arrangement of objects.
 * For example, 3124 is one possible permutation of the digits
 * 1, 2, 3 and 4.
 * If all of the permutations are listed numerically
 * or alphabetically, we call it lexicographic order.
 * The lexicographic permutations of 0, 1 and 2 are:
 *
 * 012   021   102   120   201   210
 *
 * What is the millionth lexicographic permutation of the digits
 * 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
fun main() {
    val permutations = ArrayList<String>()
    permute("0123456789".toMutableList(), permutations)
    val result = permutations.sorted()[999_999]
    println(result)
}

fun permute(values: MutableList<Char>, p: ArrayList<String>, l: Int = 0, r: Int = values.size - 1) {
    if (l == r) {
        p.add(values.joinToString(separator = ""))
    } else {
        for (i in l..r) {
            swap(values, l, i)
            permute(values, p, l + 1, r)
            swap(values, l, i)
        }
    }
}

fun swap(v: MutableList<Char>, l: Int, r: Int) {
    val tmp = v[l]
    v[l] = v[r]
    v[r] = tmp
}

