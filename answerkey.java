import java.util.Objects;

public class answerkey extends exam {
    public static int mark;
    String qstno;

    public answerkey(String qstno, String answer, int mark) {

        this.qstno = qstno;
        this.answer = answer;
        this.mark = mark;
    }
    void answer(){
        int mark1;

    }

    String answer;

    public static void main(String[] args) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof answerkey)) return false;
        answerkey answerkey = (answerkey) o;
        return mark == answerkey.mark &&
                Objects.equals(qstno, answerkey.qstno) &&
                Objects.equals(answer, answerkey.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, qstno, answer);
    }
}