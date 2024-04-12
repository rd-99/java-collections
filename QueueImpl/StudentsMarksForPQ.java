package QueueImpl;

public class StudentsMarksForPQ implements Comparable<StudentsMarksForPQ>{
    private int MathsMarks;
    private int ArtsMarks;
    private int CSMarks;

    public StudentsMarksForPQ(int i, int i1, int i2) {
        setArtsMarks(i);
        setCSMarks(i2);
        setMathsMarks(i1);
    }

    public int getMathsMarks() {
        return MathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        MathsMarks = mathsMarks;
    }

    public int getArtsMarks() {
        return ArtsMarks;
    }

    public void setArtsMarks(int artsMarks) {
        ArtsMarks = artsMarks;
    }

    public int getCSMarks() {
        return CSMarks;
    }

    public void setCSMarks(int CSMarks) {
        this.CSMarks = CSMarks;
    }
    @Override
    public String toString(){
        return "Student Marks" + CSMarks + " -CS  "+MathsMarks +" --Maths  "+ ArtsMarks + " - Arts Marks  ";
    }

    @Override
    public int compareTo(StudentsMarksForPQ o) {
        return (int)((this.CSMarks + this.ArtsMarks + this.MathsMarks) - (o.ArtsMarks + o.MathsMarks + o.CSMarks))/3;
    }
}
