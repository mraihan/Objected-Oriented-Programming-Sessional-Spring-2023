package oop.lab.employeedatabase;
class Staff {
    int code;
    String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

// Teacher class
class Teacher extends Staff {
    String subject;
    String publication;

    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public String getSubject() {
        return subject;
    }

    public String getPublication() {
        return publication;
    }
}

// Officer class
class Officer extends Staff {
    String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}

// Typist class
class Typist extends Staff {
    int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

// Casual typist class
class CasualTypist extends Typist {
    int dailyWages;

    public CasualTypist(int code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public int getDailyWages() {
        return dailyWages;
    }
}

// Regular typist class
class RegularTypist extends Typist {
    public RegularTypist(int code, String name, int speed) {
        super(code, name, speed);
    }
}
