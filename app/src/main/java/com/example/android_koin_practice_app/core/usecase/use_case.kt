package com.example.android_koin_practice_app.core.usecase

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

/**
 * Abstract class for a Use Case (Interactor in terms of
 * Clean Architecture naming convention).
 *
 * This abstraction represents an execution unit for
 * different use cases (this means that any use case
 * in the application should implement this contract).
 *
 * By convention each [UseCase] implementation will
 * execute its job in a pool of threads using
 * [Dispatchers.IO].
 *
 * The result of the computation will be posted on the
 * same thread used by the @param 'scope' [CoroutineScope].
 */
abstract class UseCase<out Type, in Params> where Type : Any {

    abstract suspend fun run(params: Params): Either<Failure, Type>

    operator fun invoke(
        params: Params,
        scope: CoroutineScope = MainScope(),
        onResult: (Either<Failure, Type>) -> Unit = {}
    ) {
        scope.launch {
            val deferredJob = async(Dispatchers.IO) {
                run(params)
            }
            onResult(deferredJob.await())
        }
    }

    /**
     * Helper class to represent Empty
     * Params when a use case does not
     * need them.
     *
     * @see UseCase
     */
    class None
}