package eu.gitgud.kotlintemplate.di.activity.main

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import eu.gitgud.kotlintemplate.di.Item
import java.util.*

@Module
@InstallIn(ActivityRetainedComponent::class)
object MainModule {

    @Provides
    fun item(): Item = Item(Random().nextInt())

}