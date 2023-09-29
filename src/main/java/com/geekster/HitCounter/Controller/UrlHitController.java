package com.geekster.HitCounter.Controller;

import com.geekster.HitCounter.Model.User;
import com.geekster.HitCounter.Services.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    public UrlHitService urlHitService;

    @GetMapping("count")
    public String getHitCount(){
        return "visitors: "+urlHitService.getHitCount();
    }

    @GetMapping("username/{username}/count")
    public User getCountByUser(@PathVariable String username){
        return urlHitService.getCountByUser(username);
    }

}
