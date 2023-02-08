package com.takeawaydraft.Repositories;

import com.takeawaydraft.Models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
    Admin findByIdAndPassword(Long id, String password);

    Admin findAdminById(Long adminId);
    @Override
    ArrayList<Admin> findAll();
}
