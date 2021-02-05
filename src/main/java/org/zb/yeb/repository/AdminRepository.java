package org.zb.yeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zb.yeb.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    @Query(value = "select a from Admin a where a.enabled=true and a.username=?1")
    Admin findAdminByUsername(String username);
}
