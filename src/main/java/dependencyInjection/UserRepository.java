package dependencyInjection;

import org.springframework.stereotype.Repository;

/**
 * Created by tuananh on 05/28/17.
 */
@Repository
public class UserRepository {

    public UserProfile getUserProfile(){
        return new UserProfile("Phat", "DaNang", 28 );
    }

}
