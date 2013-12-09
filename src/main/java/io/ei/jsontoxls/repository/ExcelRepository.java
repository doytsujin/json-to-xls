package io.ei.jsontoxls.repository;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

public interface ExcelRepository {
    @SqlUpdate("INSERT INTO excel (token, data) VALUES (:token, :data)")
    void add(@Bind("token") String token, @Bind("data") byte[] data);

    @SqlQuery("SELECT data FROM excel WHERE token = :token")
    byte[] findByToken(@Bind("token") String token);
}