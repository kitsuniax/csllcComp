public class githubComp {
    public static void main(String[] args) {
        // ROUND 1
        String str = "abcdefghijklmnopqrstuvwxyz"; // editor: Iris
                                                   // note: made string for round 1
        for (int i = 0; i < str.length(); i++) { //editor: Pallavi
            if (i%3 == 0 && i%2 ==1){ //editor: Audrey
                System.out.println(str.charAt(i));  //editor: Iris
            }
        }

    }
}