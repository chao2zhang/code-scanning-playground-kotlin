package com.github.chao2zhang.codescanningplaygroundkotlin.library

object FactorialCalculator {

    tailrec fun computeFactorial(input: Int, temp: Long = 1L): Long =
        when {
            input < 0 -> error("Factorial is not defined for negative numbers adsfasdfd afdsa dsfaasdfasdf asdf ")
            input == 0 -> temp
            else -> computeFactorial(input - 1, temp * input)
        }

    fun a() = 42
}
