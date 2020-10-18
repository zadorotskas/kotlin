// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u downTo 1u step 2) {
        uintList += i
    }
    assertEquals(listOf(1u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL downTo 1uL step 2L) {
        ulongList += i
    }
    assertEquals(listOf(1uL), ulongList)

    return "OK"
}