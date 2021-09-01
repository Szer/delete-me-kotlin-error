package delete.me.kotlin.bug.java;

import org.testcontainers.containers.PostgreSQLContainer;

public class Java {
    private PostgreSQLContainer server = null;

    public void someLibraryMethod() {
        var instance = new PostgreSQLContainer("postgres:11.11-alpine")
                .withUsername("")
                .withPassword("");
        server = instance;
    }
}
