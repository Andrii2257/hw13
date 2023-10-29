package org.example.migration;

import org.flywaydb.core.Flyway;

public class FlywayMigration {
    public void migrate() {
        String jdbcUrl = "jdbc:h2:./h2/mydb";
        String username = "sa";
        String password = "root";
        Flyway flyway = Flyway.configure()
                .dataSource(jdbcUrl, username, password)
                .locations("classpath:db/migrations")
                .load();
        flyway.migrate();
    }
}
