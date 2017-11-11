package com.soywiz.kds.ext

fun <T> mapWhile(cond: () -> Boolean, gen: (Int) -> T): List<T> {
	val out = arrayListOf<T>()
	while (cond()) out += gen(out.size)
	return out
}