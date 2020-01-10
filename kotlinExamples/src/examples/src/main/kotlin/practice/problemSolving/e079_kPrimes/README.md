# K-Prime
***
* **K-Prime**: A natural number is called *k-prime* if it has exactly *k* prime factors.
* Function takes a range, a number k and returns a list of the k-primes in the range.
* Example:
    ```kotlin
    fun kPrimes(k: Int, start: Int, end: Int): List<Int> { }
    ```
    `kPrimes(5, 500, 600) --> [500, 520, 552, 567, 588, 592, 594]`