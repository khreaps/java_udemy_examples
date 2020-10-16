public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public boolean isTeen() {
        return ((this.age > 12 && this.age < 20) ? true : false);
    }

    public String getFullName(){

        if (this.firstName.isEmpty()){
            return this.lastName;
        } else if (this.lastName.isEmpty()){
            return this.firstName;
        } else if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }

        return (this.firstName + " " + this.lastName);
    }

}
