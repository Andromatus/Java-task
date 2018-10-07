import java.util.*;
public class Student {
    private int id;
    private static int nextId = 0;
    private String firstName;
    private String secondName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private String address;
    private int tel;
    private String faculty;
    private int course;
    private int group;

    public void setId() {
        id = nextId;
        nextId++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;

    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public void setTel(int tel) {
        this.tel = tel;

    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;

    }

    public void setCourse(int course) {
        this.course = course;

    }

    public void setGroup(int group) {
        this.group = group;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public int getTel() {
        return tel;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public static int getNextId() {
        return nextId;
    }

    public String toString() {
        return firstName + "" + lastName + "" + secondName + ""
                + day + "" + month + "" + year + "" + address + "" + tel + "" + faculty + "" + course + "" + group + "";
    }
    public static void main(String[] args) {
        Student student;
        List<Student> students = new ArrayList<Student>();
        System.out.println("Ввести данные студента? Выбор: Да или Нет.");
        Scanner in = new Scanner(System.in);
        String answer1 = "Да";
        String answer2 = "Нет";
        String answ = in.next();
        while(true){
            if(answ.equals(answer1)){
                student = new Student();
                System.out.println("Введите имя: ");
                student.setFirstName(in.next());
                System.out.println("Введите фамилию: ");
                student.setSecondName(in.next());
                System.out.println("Введите отчество: ");
                student.setLastName(in.next());
                System.out.println("Введите дату рождения: ");
                System.out.println("День: ");
                student.setDay(in.nextInt());
                System.out.println("Месяц: ");
                student.setMonth(in.nextInt());
                System.out.println("Год: ");
                student.setYear(in.nextInt());
                System.out.println("Введите адрес: ");
                student.setAddress(in.next());
                System.out.println("Введите телефон: ");
                student.setTel(in.nextInt());
                System.out.println("Введите факультет: ");
                student.setFaculty(in.next());
                System.out.println("Введите курс: ");
                student.setCourse(in.nextInt());
                System.out.println("Введиту группу: ");
                student.setGroup(in.nextInt());
                students.add(student);
                for(Student s:students){
                    s.setId();
                    System.out.println("Имя: "+s.getFirstName()+'\n'+"Отчество: "+s.getSecondName()+'\n'+"Фамилия: "+s.getLastName()+'\n'
                            +"Дата рождения :"+s.getDay()+"."+s.getMonth()
                            +"."+s.getYear()+'\n'+"Адрес: "+s.getAddress()+'\n'+"Телефон: "+s.getTel()+'\n'
                            +"Факультет: "+s.getFaculty()+'\n'+"Курс: "+s.getCourse()+'\n'+"Группа: "+s.getGroup()+'\n'+"id: "+s.getId());
                }
                System.out.println("Ввести данные студента? Выбор: Да или Нет.");
                answ=in.next();
            }
            else
            if(answ.equals(answer2)){
                System.out.println("Выход");
                break;
            }
        }

    }
}

