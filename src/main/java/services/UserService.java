package services;

import models.UserNova;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<UserNova> userNovaList = new ArrayList<>(){{
        new UserNova(1L, "Max", "Johnson");
        new UserNova(2L, "Paul", "Lennon");
        new UserNova(3L, "John", "Marks");
        new UserNova(4L, "Jacob", "Harrison");
    }};


    public List<UserNova> getUsers() {
        return userNovaList;
    }

    UserNova user;

    public UserNova getUserById(Long id){
        for(UserNova userNova: userNovaList){
            if(userNova.getId() == id){
                user = userNova;
            }
        }
        return user;
    }
}
