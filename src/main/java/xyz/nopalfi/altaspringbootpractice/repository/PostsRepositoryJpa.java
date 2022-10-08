package xyz.nopalfi.altaspringbootpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.nopalfi.altaspringbootpractice.entity.Posts;

@Repository
public interface PostsRepositoryJpa extends JpaRepository<Posts, Long> {
}
