package com.app.gymanagement.repository;

import com.app.gymanagement.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
