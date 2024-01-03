package au.airtasker.kotlinmultiplatformsharedmodule

class WebPlatform: Platform {
    override val name: String = "Web"
}

actual fun getPlatform(): Platform = WebPlatform()
