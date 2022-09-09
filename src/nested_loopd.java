public class nested_loopd {
    public static void main(String[] args) {

        String str = "java";
        String checked = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;

            if(!checked.contains("" + str.charAt(i)))// only run the coutning and inner loop uf the character has not already been checked
            for( int j = 0; j < str.length(); j++){// inner: compare the character we are looking at (i) with each other in the String

                if(str.charAt(i) == str.charAt(j)){
                    count++;


                }
            }// inner loop ends
            System.out.println(str.charAt(i) + " - " + count);
            checked += str.charAt(i);

        } // if statement ends

    }// outer loop ends
}
