import java.util.HashMap;
import java.lang.*;
public class exam {



    public static void main(String[] args) {
        HashMap<String, answerkey> answerkey = new HashMap();
        //answer key
        answerkey s7 = new answerkey("1", "C", 2);
        answerkey s8 = new answerkey("2", "B", 3);
        answerkey s9 = new answerkey("3", "A", 4);
        answerkey s10 = new answerkey("4", "D", 6);
        answerkey s11 = new answerkey("5", "B", 1);
        answerkey s12 = new answerkey("6", "C", 5);

        answerkey.put(s7.qstno, s7);
        answerkey.put(s8.qstno, s8);
        answerkey.put(s9.qstno, s9);
        answerkey.put(s10.qstno, s10);
        answerkey.put(s11.qstno, s11);
        answerkey.put(s12.qstno, s12);

        HashMap<String, answersheet> answersheet = new HashMap();
        answersheet s1 = new answersheet("1", "A");
        answersheet s2 = new answersheet("2", "D");
        answersheet s3 = new answersheet("3", "B");
        answersheet s4 = new answersheet("4", "D");
        answersheet s5 = new answersheet("5", "B");
        answersheet s6 = new answersheet("6", "C");
        answersheet.put(s1.qstno,s1);
        answersheet.put(s2.qstno,s2);
        answersheet.put(s3.qstno,s3);
        answersheet.put(s4.qstno,s4);
        answersheet.put(s5.qstno,s5);
        answersheet.put(s6.qstno,s6);
        int mar = 0;
        for (String qstno : answersheet.keySet()) {
            if (answerkey.containsKey(qstno)) {
                if (answerkey.get(qstno).equals(answersheet.get(qstno)));
                    mar=mar+answerkey.mark;
                   System.out.println("Total mark: " + mar);
        };};
    }
}




