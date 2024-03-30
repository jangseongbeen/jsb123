package chap04program;
class member {
	String name;
	String id;
	String password;
	int age;
	
	public member (String name,String id,String password,int age) {
		this.name=name;
		this.id=id;
		this.password=password;
		this.age=age;
	}
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id =id;
    } 
    public String getPasswd() {
        return password;
    }
    public void setPasswd(String password) {
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
	
}
public class p164num3 {

}
