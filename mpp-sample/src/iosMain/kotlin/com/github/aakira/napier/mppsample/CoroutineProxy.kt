package com.github.aakira.napier.mppsample

import kotlinx.coroutines.launch

fun Sample.suspendHelloKt() {
    NativeScope().launch {
        suspendHello()
    }
}
