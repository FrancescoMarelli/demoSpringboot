package com.example.demo.controllers;

import com.example.demo.configuration.Paginas;
import com.example.demo.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/home")
public class basicController {
    public List<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1, "Post 1", "Content 1", "/img/foto1.jpg", new Date()));
        posts.add(new Post(2, "Post 2", "Content 2", "/img/foto1.jpg", new Date()));
        posts.add(new Post(3, "Post 3", "Content 3", "/img/foto1.jpg", new Date()));
        posts.add(new Post(4, "Post 4", "Content 4", "/img/foto1.jpg", new Date()));
        posts.add(new Post(5, "Post 5", "Content 5", "/img/foto1.jpg", new Date()));
        posts.add(new Post(6, "Post 6", "Content 6", "/img/foto1.jpg", new Date()));


        return posts;
    }

    // Generar EndPoint
    // ¿Con que metodo y bajo que uRL se va a mostrar este dato? porque en nuestro caso tenemos que obtener
    @GetMapping(path = {"/posts", "/"})
    public String func(Model model) {
        model.addAttribute("posts", this.getPosts());
        return "index";
    }

    @GetMapping(path = {"/post"})
    public ModelAndView getPost(@RequestParam(defaultValue = "1", name = "id", required = false) int id) {
        ModelAndView mv = new ModelAndView(Paginas.POST);
        List<Post> postFiltered = this.getPosts().stream()
                                    .filter((p) ->  { return p.getId() == id;
                                    }).collect(Collectors.toList());
        mv.addObject("post", postFiltered.get(0));
        return mv;
        }


}
