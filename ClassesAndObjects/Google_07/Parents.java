package Excercises.ClassesAndObjects.Google_07;

public class Parents {
    private String parentName;
    private String parentBirthday;

    public Parents(String parentName,String parentBirthday){
        setParentName(parentName);
        setParentBirthday(parentBirthday);
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }


    public String getParentBirthday() {
        return parentBirthday;
    }

    public void setParentBirthday(String parentBirthday) {
        this.parentBirthday = parentBirthday;
    }

    @Override
    public String toString(){
        return parentName+" "+parentBirthday;
    }

}
