package io.kotless


/**
 * Definition of Kotless application.
 *
 * It may include few Web applications with
 * routes served from static and via lambdas.
 */
data class Schema(
        /** Configuration of kotless itself */
        val kotlessConfig: KotlessConfig,
        /** Web applications defined by application */
        val webapps: Set<Webapp>,
        /** Lambdas used in application */
        val lambdas: Set<Lambda>,
        /** Static resources used in application */
        val statics: Set<StaticResource>)
