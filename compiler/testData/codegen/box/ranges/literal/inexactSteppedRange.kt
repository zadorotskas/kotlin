// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in 3..8 step 2) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(3, 5, 7)) {
        return "Wrong elements for 3..8 step 2: $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in 3.toByte()..8.toByte() step 2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(3, 5, 7)) {
        return "Wrong elements for 3.toByte()..8.toByte() step 2: $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in 3.toShort()..8.toShort() step 2) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(3, 5, 7)) {
        return "Wrong elements for 3.toShort()..8.toShort() step 2: $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in 3L..8L step 2L) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(3, 5, 7)) {
        return "Wrong elements for 3L..8L step 2L: $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in 'a'..'d' step 2) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>('a', 'c')) {
        return "Wrong elements for 'a'..'d' step 2: $list5"
    }

    return "OK"
}
