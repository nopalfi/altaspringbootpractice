package xyz.nopalfi.altaspringbootpractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.nopalfi.altaspringbootpractice.entity.Posts;

@Repository
public interface PostsRepositoryCrud extends CrudRepository<Posts, Long> {
}
