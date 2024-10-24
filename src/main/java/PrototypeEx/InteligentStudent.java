package PrototypeEx;

public class InteligentStudent extends Student {

    private int iq;

    @Override
    public InteligentStudent clone() {
        InteligentStudent inteligentStudent = new InteligentStudent();

        inteligentStudent.setName(this.getName());
        inteligentStudent.setAge(this.getAge());
        inteligentStudent.setBatch(this.getBatch());
        inteligentStudent.setPsp(this.getPsp());
        inteligentStudent.setBatchavgpsp(this.getBatchavgpsp());

        inteligentStudent.iq = this.iq;
        return inteligentStudent;

    }
}
