package dio.spring_web_api.model;

public class Usuario {
    private Integer id;
    private String login;
    private String password;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        id = this.id;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
    	login = this.login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
    	password = this.password;
    }
    
    
}
