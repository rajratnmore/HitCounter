package com.geekster.HitCounter.Repo;

import com.geekster.HitCounter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UrlHitRepo {

    @Autowired
    private List<User> userList;
    private Integer hitCount = 0;

    public Integer getHitCount() {
        return ++hitCount;
    }

    public List<User> getUserList(){
        return userList;
    }

}
