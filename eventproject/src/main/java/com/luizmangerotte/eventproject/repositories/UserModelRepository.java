package com.luizmangerotte.eventproject.repositories;

import com.luizmangerotte.eventproject.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModelRepository extends JpaRepository<UserModel, Long> {
}
