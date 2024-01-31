package com.orange

import software.amazon.awscdk.App

fun main() {
    val app = App()
    CdkKotlinGradleStack(app, "CdkKotlinGradleStack")
    app.synth()
    println("Hello From Sweden, hope you like this example stack. Regards Lars")
}