package eu.gitgud.kotlintemplate

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class BaseApplication : Application() {

    companion object {
        const val TAG: String = "BaseApplication"
    }

}