public class MainApp {
    public static void main(String[] args) {

        Person persons[] = new Person[5];
        

        input(persons);
        

        print(persons);
    }
    
    public static void input(Person[] persons) {
        persons[0] = new Student("Huy", 18, 7.0, 8.0, 9.0);
        persons[1] = new Student("Hà", 18, 6.0, 7.0, 8.0);
        persons[2] = new Student("Hiếu", 18, 9.0, 8.0, 7.0);
        persons[3] = new Teacher("Tùng", 31, 2.0);
        persons[4] = new Teacher("Bình", 33, 3.0);
    }
    

    public static void print(Person[] persons) {
        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() +
                                   ", Toan: " + student.getToan() + ", Ly: " + student.getLy() +
                                   ", Hoa: " + student.getHoa() + ", Diem trung binh: " + student.diemTrungBinh());
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Teacher: " + teacher.getName() + ", Age: " + teacher.getAge() +
                                   ", HSL: " + teacher.getHsl() + ", Luong: " + teacher.tinhLuong());
            }
        }
    }
}