package com.takeawaydraft.Service;

import com.takeawaydraft.Models.Admin;
import com.takeawaydraft.Repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }

    public void createAdmin(Admin admin) throws Exception{
        this.adminRepository.save(admin);
    }

    public Admin verifyAdmin(Admin adminLoginRequest) throws Exception{
        Admin foundAdmin = this.adminRepository.findByIdAndPassword(adminLoginRequest.getAdminId(), adminLoginRequest.getPassword());
        if(foundAdmin == null) {throw new Exception("Username or password incorrect");}

        return foundAdmin;
    }

    public Admin findAdminById(Long adminId){
        return this.adminRepository.findById(adminId).orElseThrow();
    }
}
