package it.plansoft.publication.service;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.service.interfaces */

import it.plansoft.publication.model.Post;
import it.plansoft.publication.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService extends BaseCrudService<PostRepository, Post, Long> {
    public PostService(PostRepository repository) {
        super(repository);
    }

}
