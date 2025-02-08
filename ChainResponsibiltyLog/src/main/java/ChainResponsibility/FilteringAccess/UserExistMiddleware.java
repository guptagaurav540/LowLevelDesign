package ChainResponsibility.FilteringAccess;

public class UserExistMiddleware  extends  Middleware{
    private Server server;
    public UserExistMiddleware(Server server) {
        this.server = server;
    }
    public boolean check(String email,String password){
        if(!server.hasEmail(email))
        {
            System.out.println("This Mail is not registered!");
            return false;
        }
        if(!server.isValidPassword(email,password)){
            System.out.println("Wrong Password!");
            return false;
        }
        return checkNext(email,password);
    }
}
