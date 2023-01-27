public class StringHandling02 {

    /**
     *
     * @param s
     * @return supportString wich is build before the first " "
     */
    public String extractWordBeforeSpace(String s) {
        int i = 0;
        String supportString = "";
        String whileString=String.valueOf(s.charAt(i));

        while (!whileString.equals(" ")) {
                supportString += String.valueOf(s.charAt(i));
                i++;
                whileString=String.valueOf(s.charAt(i));
        }
        return supportString;
    }

    /**
     *
     * @param s
     * @return supportString wich is build after the first " " meet in the string
     */
    public String extractWordAfterSpace(String s){

        int i=0;
        String supportString = "";
        String whileString=String.valueOf(s.charAt(i));

        while (i<s.length()){
            whileString=String.valueOf(s.charAt(i));
            i++;
            if(whileString.equals(" ")){
                while (i<s.length()){
                    supportString += String.valueOf(s.charAt(i));
                    i++;
                }
            }
        }
        return supportString;
    }




        public static void main (String[]args){

            String string1 = "united kingdom";
            String string2 = "germany";

            String sub1 = "";
            String sub2 = "";

            StringHandling02 meth= new StringHandling02();
            sub1=meth.extractWordBeforeSpace(string1);
            sub2=meth.extractWordAfterSpace(string1);

            char[] arrayChar=(sub1+" "+string2+" "+sub2).toUpperCase().toCharArray();

            System.out.print(arrayChar);
        }
    }


