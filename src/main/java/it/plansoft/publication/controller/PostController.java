package it.plansoft.publication.controller;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.controller.interfaces */

import it.plansoft.publication.controller.interfaces.BaseCrudController;
import it.plansoft.publication.model.Post;
import it.plansoft.publication.repository.PostRepository;
import it.plansoft.publication.service.PostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController extends BaseCrudController<PostService, PostRepository, Post, Long> {

    public PostController(PostService service) {
        super(service);
    }

}
