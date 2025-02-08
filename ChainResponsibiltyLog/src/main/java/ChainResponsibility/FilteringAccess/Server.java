package ChainResponsibility.FilteringAccess;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private final Map<String,String> user = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware){
        this.middleware = middleware ;
    }
    public boolean logIn(String email,String password)
    {
        if(middleware.check(email,password))
        {
            System.out.println("Authorization have been Successful!");
            return true;
        }
        return false;
    }
    public void register(String email,String password)
    {
        user.put(email,password);
    }
    public boolean hasEmail(String email)
    {
        return user.containsKey(email);
    }
    public boolean isValidPassword(String email,String password)
    {
        return user.get(email).equals(password);
    }
}
