import java.util.Objects;

public class answersheet extends exam{

public String qstno;
public String answer;

    public answersheet(String qstno, String answer) {
        this.qstno = qstno;
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof answersheet)) return false;
        answersheet that = (answersheet) o;
        return Objects.equals(qstno, that.qstno) &&
                Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qstno, answer);
    }

    public static void main(String[] args) {


    }
}
