package PrototypeEx;

public class Student implements Prototype<Student>
{
    private String name;
    private int age;
    private String batch;
    private double psp;
    private double batchavgpsp;

    @Override
    public Student clone() {

        Student student = new Student();
        student.name = this.name;
        student.age = this.age;
        student.batch=this.batch;
        student.psp = this.psp;
        student.batchavgpsp = this.batchavgpsp;


        return student;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getBatchavgpsp() {
        return batchavgpsp;
    }

    public void setBatchavgpsp(double batchavgpsp) {
        this.batchavgpsp = batchavgpsp;
    }
}
