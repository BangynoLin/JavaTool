/**
 *  @param args[]   from the input parameter
 *  @output         encoded Base64 text
 */

import java.net.URL;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

class Base64Encode {
    public static void main(String args[]){

        String readme         = "* Give the plain text to be encoded as Base64 message *";
        showReamMe(readme);

        try{
            String str = "";
            String strDividers = "--------------------------------------------------------------------------------------------------";
            if (args.length < 1) {
                System.out.println("Need input string to encode.");
                return;
            } else {
                str = composeString(args);
                if (str == "") {
                    System.out.println("composeString() function Error!");
                    return;
                }
            }

            //encoding  byte array into base 64
            Base64.Encoder enc = Base64.getEncoder();
            byte[] strenc = enc.encode(str.getBytes("UTF-8"));

            System.out.println("Base64 Encoded String : \n" + strDividers + "\n" + new String(strenc,"UTF-8") + "\n" + strDividers);

            //decoding byte array into base64
            Base64.Decoder dec= Base64.getDecoder();
            byte[] strdec=dec.decode(strenc);

            System.out.println("Base64 Decoded String : \n"+ strDividers + "\n" + new String(strdec,"UTF-8") + "\n" + strDividers);
        }
        catch(Exception e){
            System.out.println("Exception = " + e);
            e.printStackTrace(System.out);
        }
    }

    /**
     *  Compose the strings in an array with newline symbo as a single string.
     */
    private static String composeString(String args[]) {
        String split = "\n";
        String str = "";
        if (args != null && args.length > 0) {
            str = args[0];
        }
        else {
            System.out.println("Error calling composeString()");
            return "";
        }

        if (args.length == 1) {
            return str;
        } else if (args.length > 1) {
            for (int i = 1; i < args.length ; i++) {
                str += split + args[i];
            }
        }
        System.out.println("composeString() output: {\n" + str + "\n}");
        return str;
    }

    /**
     *  Give the text, build a message with edge
     */
    private static void showReamMe(String text) {
        String readmeDividers = "\n";
        // Create edge
        for(int i = 0; i < text.length(); i++)
            readmeDividers += "*";
        readmeDividers += "\n";
        System.out.println(readmeDividers + text + readmeDividers);
    }
}




