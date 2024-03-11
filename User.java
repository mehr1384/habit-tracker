

package UserPackage;
import TaskPackage.Task;
public class User
{
    private String username;
    private String password;
    public String first_name;
    public String last_name;
    public String email;
    public int streak;

    public User(String username, String password,String first_name,String last_name,String email){
        this.username=username;
        this.password=password;
        this.first_name=first_name;
        this.last_name = last_name;
        this.email = email;
        this.streak = 0;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username2){
        this.username = username2;
    }
    public  String getPassword(){
        return password;
    }
    public void setPassword(String password2){
        this.password= password2 ;
    }
    public  String getFullName(){
        return  first_name + " " +last_name;
    }
    public Task createTask(){
        return new Task("Task");
    }
}
