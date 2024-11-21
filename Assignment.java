
public class Assignment {
    
    private String name;
    private String type;
    private int score;

    
    public Assignment() {
        this.name = "";
        this.type = "";
        this.score = 0;
    }

    
    public Assignment(String name, String type, int score) {
        this.name = name;
        this.type = type;
        this.score = score;
    }

    
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getScore() {
        return score;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setScore(int score) {
        this.score = score;
    }

    
    public String getLetterGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}