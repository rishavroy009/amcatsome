public class throwstu {
    int student;
    public void setStudent(int val) throws Exception {
        if(val<0){
            throw new Exception("Value cant be negative");
        }
        student=val;
    }
}
