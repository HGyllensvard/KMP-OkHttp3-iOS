package au.airtasker.kotlinmultiplatformsharedmodule

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform