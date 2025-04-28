package id.mzennis.potato.debug

import android.content.Context

object DebugUtils {
    
    // No-op implementation for release builds
    fun openDebugScreen(context: Context) {
        // Does nothing in release builds
    }
}