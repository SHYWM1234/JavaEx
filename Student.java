public class Student{
    private String stuName;
    private int stuNo;
    private double stuScore;

    public void setStuName(String name){
        this.stuName = name;
    }
    public String getStuName(){
        return this.stuName;    
    }
    public void setStuNo(int no){
        this.stuNo = no;
    }
    public int getStuNo(){
        return this.stuNo;
    }
    public void setStuScore(double score){
        this.stuScore = score;        
    }
    public double getStuScore(){
        return this.stuScore;
    }
    public void printStuInfo(){
        System.out.println(this.stuName + "的学号是" + this.stuNo);
        System.out.println(this.stuName + "的成绩是" + this.stuScore);
    }
}