package clickgame.click_game_project.services;


import java.util.List;

import clickgame.click_game_project.entities.User;

public interface UserService {
    User save(User user);
    void delete(int id);
    List<User> findAll();

        

}
