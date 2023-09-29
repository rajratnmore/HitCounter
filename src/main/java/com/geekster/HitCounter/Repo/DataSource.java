package com.geekster.HitCounter.Repo;

import com.geekster.HitCounter.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class DataSource {
    @Bean
    public List<User> getUserList(){
        return new ArrayList<>();
    }
}
