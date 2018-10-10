package src2;

public class Pupil {
    public void study(){}
    public void read(){}
    public void write(){}
    public void relax(){}
}

class ExcelentPupil extends Pupil{
    @Override
    public void study(){
        System.out.println("Excelent study");
    }
    @Override
    public void read(){
        System.out.println("Excelent read");
    }
    @Override
    public void write(){
        System.out.println("Excelent write");
    }
    @Override
    public void relax(){
        System.out.println("Excelent relax");
    }
}

class GoodPupil extends Pupil{
    @Override
    public void study(){
        System.out.println("Good study");
    }
    @Override
    public void read(){
        System.out.println("Good read");
    }
    @Override
    public void write(){
        System.out.println("Good write");
    }
    @Override
    public void relax(){
        System.out.println("Good relax");
    }
}

class BadPupil extends Pupil{
    @Override
    public void study(){
        System.out.println("Bad study");
    }
    @Override
    public void read(){
        System.out.println("Bad read");
    }
    @Override
    public void write(){
        System.out.println("Bad write");
    }
    @Override
    public void relax(){
        System.out.println("Bad relax");
    }
}
