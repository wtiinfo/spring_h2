package com.iwsistemas.iws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iwsistemas.iws.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
