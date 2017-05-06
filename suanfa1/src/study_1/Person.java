package study_1;

/**
 * Created by ln on 2017/4/29.
 */
public class Person implements Comparable<Person>{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
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

    @Override
    public int compareTo(Person o) {
        if(this.getAge()>o.getAge()){
            return 1;
        }else if(this.getAge()==o.getAge()){
            return 0;
        }else {
            return -1;
        }
    }
}
