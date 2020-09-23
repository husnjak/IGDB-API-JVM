package com.api.igdb.exceptions

import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.core.Request
import com.github.kittinunf.result.Result

/**
 * The Request exception class wrapps the Kotlin Fuel HTTP library exception.
 *
 * @property statucCode The status code from the API
 * @property request The Kotlin Fuel request object
 * @property result The Kotlin Fuel result object, holds the FuelError
 */
class RequestException(val statusCode: Int, val request: Request, val result: Result<String, FuelError>) : Exception()
