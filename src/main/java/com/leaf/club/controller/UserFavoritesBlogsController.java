package com.leaf.club.controller;


import com.leaf.club.service.IUserFavoritesBlogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;



@Controller
@RequestMapping("/favoritesBlog")
public class UserFavoritesBlogsController {

    private static Logger log = LoggerFactory.getLogger(BlogController.class);
    @Autowired()
    private IUserFavoritesBlogsService userFavoritesBlogsService;
    @RequestMapping(value = "favorites",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> praiseBlog(@RequestBody Map<String,Object> map){
        Map<String,Object> temp = new HashMap<>();
        Map<String,Object> result = new HashMap<>();
        try {
            result = userFavoritesBlogsService.favoritesBlog(map);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }

}
