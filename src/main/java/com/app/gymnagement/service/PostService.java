package com.app.gymnagement.service;

import com.app.gymnagement.entity.Post;
import com.app.gymnagement.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostDto getById(long id);

    PostDto updateById(PostDto postDto,long id);

    void deleteById(long id);

}
