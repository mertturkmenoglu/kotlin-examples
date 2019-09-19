package languageExamples.dsl.e001_InfixFunction

import kotlin.test.assertEquals

infix fun <T> T?.shouldBeEqual(expectedValue: T?) = assertEquals(this, expectedValue)

infix fun String.concat(other: String) = "$this$other"