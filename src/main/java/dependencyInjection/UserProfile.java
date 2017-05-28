package dependencyInjection;

/**
 * Created by tuananh on 05/28/17.
 */
public class UserProfile {
    private String name;
    private String address;
    private int age;

    public UserProfile() {
    }

    public UserProfile(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
