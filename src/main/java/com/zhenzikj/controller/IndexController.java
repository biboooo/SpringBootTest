package com.zhenzikj.controller;

import com.zhenzikj.service.BlogService;
import com.zhenzikj.vo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private BlogService blogService;

    @RequestMapping("/index")
    public String index(Model model){
        List<Blog> blogs = this.blogService.list();
        Blog blog = this.blogService.selectByDbid(2);
        model.addAttribute("blogs", blogs);
        model.addAttribute("blog", blog);
        return "index";
    }
}
