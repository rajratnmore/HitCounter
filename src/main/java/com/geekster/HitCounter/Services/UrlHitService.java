package com.geekster.HitCounter.Services;

import com.geekster.HitCounter.Model.User;
import com.geekster.HitCounter.Repo.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {


    @Autowired
    UrlHitRepo urlHitRepo;

    public Integer getHitCount() {
        return urlHitRepo.getHitCount();
    }


    public User getCountByUser(String username) {

        for(User currUser : urlHitRepo.getUserList()){
            if (currUser.getUsername().equals(username)) {
                currUser.setHitcount(currUser.getHitcount() + 1);
                return currUser;
            }
        }

        User newUser = new User(username, 1);
        urlHitRepo.getUserList().add(newUser);
        return newUser;
    }
}
