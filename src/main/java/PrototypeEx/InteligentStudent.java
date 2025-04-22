package PrototypeEx;

public class InteligentStudent extends Student {

    private int iq;

    InteligentStudent() {
    }

    InteligentStudent(InteligentStudent student) {
        super(student);
        this.iq=student.iq;
    }

    @Override
    public InteligentStudent clone() {
       return new InteligentStudent(this);

    }
}
