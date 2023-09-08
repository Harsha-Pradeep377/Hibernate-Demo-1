package util;

public class SessionFactoryConfiguration {
    
    private static SessionFactoryConfiguration sessionFactoryConfiguration;

    private SessionFactoryConfiguration(){

    }

    public static SessionFactoryConfiguration getInstance(){
        return sessionFactoryConfiguration == null ? 
                sessionFactoryConfiguration = new SessionFactoryConfiguration()
                : sessionFactoryConfiguration;
    }

}
