package com.milan.rest.webservices.restfulwebservices.jpa;

import com.milan.rest.webservices.restfulwebservices.user.Post;
import com.milan.rest.webservices.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
