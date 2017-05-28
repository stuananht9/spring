package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tuananh on 05/28/17.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserProfile getUserProfile(){
        return userRepository.getUserProfile();
    }

}
