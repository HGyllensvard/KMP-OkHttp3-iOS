package au.airtasker.kotlinmultiplatformsharedmodule

import okhttp3.OkHttp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name} + ${OkHttp.VERSION}}!"
    }
}
