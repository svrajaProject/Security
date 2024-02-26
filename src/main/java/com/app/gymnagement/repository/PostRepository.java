package com.app.gymnagement.repository;

import com.app.gymnagement.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
