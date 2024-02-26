package com.app.gymnagement.service.Impl;

import com.app.gymnagement.entity.Post;
import com.app.gymnagement.exception.ResourceNotFoundException;
import com.app.gymnagement.payload.PostDto;
import com.app.gymnagement.repository.PostRepository;
import com.app.gymnagement.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
//        convert dto to entity
        Post post = mapToEntity(postDto);
        Post newPost =  postRepository.save(post);
//        return entity to dto
        return mapToDto(newPost);
    }

    @Override
    public List<PostDto> getAllPost() {
       List<Post> posts = postRepository.findAll();
        return posts.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public PostDto getById(long id) {
        Post posts =  postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post","id",id));
    return mapToDto(posts);
    }

    @Override
    public PostDto updateById(PostDto postDto, long id) {
        Post posts =  postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post","id",id));
        posts.setName(postDto.getName());
        Post updatePost = postRepository.save(posts);
        return mapToDto(updatePost);
    }

    @Override
    public void deleteById(long id) {
        Post posts =  postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post","id",id));
        postRepository.delete(posts);
    }


    private Post mapToEntity(PostDto postDto){
        Post post = new Post();
        post.setName(postDto.getName());
        return post;
    }
    private PostDto mapToDto(Post post){
        PostDto  postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setName(post.getName());
        return postDto;
    }
}
