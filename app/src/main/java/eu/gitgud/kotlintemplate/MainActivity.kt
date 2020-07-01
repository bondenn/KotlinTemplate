package eu.gitgud.kotlintemplate

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import eu.gitgud.kotlintemplate.di.Item
import eu.gitgud.kotlintemplate.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity(R.layout.activity_main) {

    companion object {
        private const val TAG: String = "MainActivity"
    }

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "${viewModel.hashCode()}")
        viewModel.log()
        message_textview.text = "Hello World"
    }

    override fun inject() {
        Log.d(TAG, "Injected ${this.localClassName}")
    }

}
