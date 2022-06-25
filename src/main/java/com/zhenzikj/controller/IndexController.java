package com.zhenzikj.controller;

import com.zhenzikj.service.BlogService;
import com.zhenzikj.vo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("api/blog")
public class IndexController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/{id}")
    @ResponseBody
    public Blog getOne(@RequestParam Integer id) {
        List<Blog> blogs = this.blogService.list();
        Blog blog = this.blogService.selectByDbid(2);

        return blog;
    }
}
