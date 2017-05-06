package study_1;

/**
 * Created by ln on 2017/4/29.
 */
public class Zoo {
    private String name;
    private Integer age;

    public Zoo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
