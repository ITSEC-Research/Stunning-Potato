package id.mzennis.potato

import android.app.Application
import id.mzennis.potato.logging.ReleaseTree
import timber.log.Timber

class PotatoApplication : Application() {
    
    override fun onCreate() {
        super.onCreate()
        
        if (BuildConfig.DEBUG) {
            // Plant the debug tree in debug builds
            Timber.plant(Timber.DebugTree())
        } else {
            // Plant the release tree in release builds
            Timber.plant(ReleaseTree())
        }
    }
}