/*
 * KOTLIN PSI SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-100
 * MAIN LINK: expressions, constant-literals, real-literals -> paragraph 1 -> sentence 3
 * NUMBER: 1
 * DESCRIPTION: A float suffix in the real literals right after a dot.
 */

val value = 0.f
val value = 00.F
val value = 000.f
val value = 0000.f

val value = 0.F
val value = 1.F
val value = 2.f
val value = 3.F
val value = 4.f
val value = 5.F
val value = 6.f
val value = 7.F
val value = 8.f

val value = 1.f
val value = 22.f
val value = 333.f
val value = 4444.F
val value = 55555.F
val value = 666666.F
val value = 7777777.f
val value = 88888888.f
val value = 999999999.F

val value = 00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.F
val value = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.f
val value = 222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222.F
val value = 555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555123456785012345678501234567850123456785012345678501234567850.F
