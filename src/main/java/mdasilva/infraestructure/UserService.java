package mdasilva.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mdasilva.domain.User;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id);
    }

    public User add(User user){
        User userAdded = userRepository.add(user);
        if(userAdded == null) throw new RuntimeException("Error when try to add the user");
        return userAdded;
    }
}
