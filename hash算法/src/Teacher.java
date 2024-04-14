public class Teacher {
    //equals和==的区别
    //1.==可以比基础数据类型也可以比较引用数据类型，比较基础数据类型时比较的是具体的值，比较引用数据类型实际上比较的是内存地址
    //2.equals是OBject的一个方法，默认的实现就是==
    //3.我们可以重写equals方法，是我们的特性需求，比如String就重写equals方法，所以字符串调用equals比较的是每一个字符
    private int id;
    private String name;
    private int age;

    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object){
        Teacher teacher = (Teacher) object;
        return teacher.getId() == this.getId() && teacher.getName().equals(this.getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
