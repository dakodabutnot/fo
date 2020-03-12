package dev.dakoda.fo

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver

open class FakeOf<T: Any>(
    private val resolvesTo: T
) : ParameterResolver {

    override fun supportsParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Boolean {
        return parameterContext.parameter.type == resolvesTo.javaClass
    }

    override fun resolveParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): T {
        return resolvesTo
    }
}