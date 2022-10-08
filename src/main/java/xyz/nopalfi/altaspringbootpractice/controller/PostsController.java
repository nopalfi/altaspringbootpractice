package xyz.nopalfi.altaspringbootpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.nopalfi.altaspringbootpractice.entity.Posts;
import xyz.nopalfi.altaspringbootpractice.repository.PostsRepositoryJpa;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/v1")
public class PostsController {

    @Autowired
    private PostsRepositoryJpa postsRepository;

    @GetMapping(value = "/posts")
    public List<Posts> getAll() {
        return postsRepository.findAll();
    }

    @PostMapping(value = "/posts")
    public Posts newPost(@RequestBody Posts posts) {
        Posts createpost = postsRepository.save(posts);
        return createpost;
    }

    @DeleteMapping(value = "/posts/{id}")
    public String deletePost(@PathVariable Long id) {
        Optional<Posts> posts = postsRepository.findById(id);
        if (posts.isPresent()) {
            postsRepository.delete(posts.get());
            return "Deleted successfully";
        } else {
            return "Error occured";
        }
    }
}
