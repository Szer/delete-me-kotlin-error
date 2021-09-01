package delete.me.kotlin.bug.kotlin

import org.testcontainers.containers.PostgreSQLContainer

class Kotlin {
    private var server: PostgreSQLContainer<*>? = null

    fun someLibraryMethod() {
        val instance = PostgreSQLContainer<PostgreSQLContainer<*>>("postgres:11.11-alpine")
            .withUsername("")
            .withDatabaseName("")
        server = instance
    }
}
