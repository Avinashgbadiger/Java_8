package service.function;

public class Student {
    private int id;
    private String name;

    public Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public int getId() {
        return id;
    }


    static class StudentBuilder {
        private int id;
        private String name;

        public StudentBuilder() {

        }

        @Override
        public String toString() {
            return "StudentBuilder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }



        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
