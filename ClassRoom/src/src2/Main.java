package src2;

public class Main {
    public static void main(String[] args) {
        ClassRoom[] room = new ClassRoom[3];

        room[0] = new ClassRoom(new ExcelentPupil());
        room[1] = new ClassRoom(new GoodPupil());
        room[2] = new ClassRoom(new BadPupil());
    }
}
