@file:Suppress("SpellCheckingInspection")

package practice.problemSolving.e021_RNA

fun rna(rna: String) = rna.toUpperCase().chunked(3).let {
    it.take(
            if (it.any { subStr -> subStr in listOf("UAA", "UAG", "UGA") })
                it.indexOf(it.first { s -> s in listOf("UAA", "UAG", "UGA") })
            else
                it.size
    )
}.map {
    when (it) {
        "AUG" -> "Methionine"
        "UUU", "UUC" -> "Phenylalanine"
        "UUA", "UUG" -> "Leucine"
        "UCU", "UCC", "UCA", "UCG" -> "Serine"
        "UAU", "UAC" -> "Tyrosine"
        "UGU", "UGC" -> "Cysteine"
        "UGG" -> "Tryptophan"
        else -> throw Exception("Unkown Codon")
    }
}

fun main() {
    val a = rna("AUGUUUUCUUAAAUG")
    println(a)
}