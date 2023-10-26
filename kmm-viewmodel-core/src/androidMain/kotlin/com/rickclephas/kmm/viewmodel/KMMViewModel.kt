package com.rickclephas.kmm.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope

/**
 * A Kotlin Multiplatform Mobile ViewModel.
 *
 * On Android this is a subclass of the Jetpack ViewModel.
 */
public actual abstract class KMMViewModel: ViewModel() {

    /**
     * The [ViewModelScope] containing the [CoroutineScope] of this ViewModel.
     *
     * On Android this is bound to `Dispatchers.Main.immediate`,
     * where on Apple platforms it is bound to `Dispatchers.Main`.
     */
    @Suppress("LeakingThis")
    public actual val viewModelScope: ViewModelScope = ViewModelScopeImpl(this)

    /**
     * Called when this ViewModel is no longer used and will be destroyed.
     */
    public actual override fun onCleared() { }
}
