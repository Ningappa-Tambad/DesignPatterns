package Builder;

public class Student
{
    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradyear;

    private Student(Builder builder)
    {
        this.name=builder.getName();
        this.age=builder.getAge();
        this.psp=builder.getPsp();
        this.batch=builder.getBatch();
        this.gradyear=builder.getGradyear();

    }

    //First create a builder object and return builder object

    public static Builder getBuilder()
    {
        return new Builder();
    }

    //Inner class-Class within class

    static class Builder
    {
        private String name;
        private int age;
        private double psp;
        private String batch;
        private int gradyear;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {

            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradyear() {
            return gradyear;
        }

        public Builder setGradyear(int gradyear)
        {
            this.gradyear = gradyear;
            return this;
        }




        public Student build()
        {
            //validation part

            if(this.getGradyear()>=2024)
            {
                throw new RuntimeException("Grad year should be leass than or equal to 2024 ");
            }

            return new Student(this);
            //validation end
        }


    }


}
