package cn.chriswood.kotlincourse

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

/**
 * This class will be used run java code in the kotlin coroutines
 * @author : prustyA : 17/06/2022
 */
class Coroutine4J {

    //Scope
    private val context: CoroutineContext = Dispatchers.IO
    private val scope = CoroutineScope(context)

    /**
     * This method will be used to return current coroutine context
     * @author : prustyA : 17/06/2022
     */
    fun getContext() = context

    /**
     * This method will be used to start executing the method block
     * @author : prustyA : 17/06/2022
     */
    fun launch(block: () -> Unit) {
        scope.launch { block() }
    }

    /**
     * This method will be used to change the context and run the block
     * @author : prustyA : 17/06/2022
     */
    fun launchWithContext(context: CoroutineContext, block: () -> Unit) {
        scope.launch {
            withContext(context) { block() }
        }
    }
}