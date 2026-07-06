import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {
    public static Optional<User> getUser(int id){
        List<User> users= Arrays.asList(new User(1,"Anurag"),new User(2,"Akhilesh"));
        for(User user:users){
            if(user.getId()==id){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
