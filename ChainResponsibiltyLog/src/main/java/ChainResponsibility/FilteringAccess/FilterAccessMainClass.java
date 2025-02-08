package ChainResponsibility.FilteringAccess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilterAccessMainClass {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static Server server ;
    public static void init(){
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(new ThrottlingMiddleware(2),
                new UserExistMiddleware(server),
                new RoleCheckMiddleware()
        );
        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
        init();
        String user = "abc@gmail.com";
        String password = "admin_pass";
        System.out.println("Login for user "+user+" is "+server.logIn(user,password) );

    }
}
