package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class UserController {
        private Persistence store = new Persistence();
        private Validation val = new Validation();

        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(userJson, User.class);

            if(!val.validate(user)) {
                return "ERROR";
            }
            store.StoreUser(user);
            return "SUCCESS";
        }
 }

