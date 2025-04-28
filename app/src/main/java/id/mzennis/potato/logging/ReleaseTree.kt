package id.mzennis.potato.logging

import android.util.Log
import timber.log.Timber

/**
 * Custom Timber tree for release builds.
 * In a real app, you might use this to send logs to a crash reporting service.
 */
class ReleaseTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority < Log.INFO) {
            // Don't log VERBOSE or DEBUG logs in release build
            return
        }
        
        // You could send important logs to a crash reporting service here
        // For example: Crashlytics.log(priority, tag, message)
        
        // Also log exception if present
        if (t != null && priority >= Log.ERROR) {
            // For example: Crashlytics.logException(t)
        }
    }
}