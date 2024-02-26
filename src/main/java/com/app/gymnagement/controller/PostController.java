package com.app.gymnagement.controller;

import com.app.gymnagement.payload.PostDto;
import com.app.gymnagement.service.PostService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto) {
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }

    @GetMapping
    public List<PostDto> getAllPost() {
        return postService.getAllPost();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(postService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updateById(@RequestBody PostDto postDto, @PathVariable(name = "id") long id) {
        return new ResponseEntity<>(postService.updateById(postDto, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable (name="id") long id){
        postService.deleteById(id);
        return new ResponseEntity<>("Deleted successfully...",HttpStatus.OK);
    }

}
