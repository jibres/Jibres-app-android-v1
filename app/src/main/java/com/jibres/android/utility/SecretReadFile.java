package com.jibres.android.utility;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SecretReadFile {
    private static String endpoint = "/endpoint.txt";
    private static String endpoint_test = "/endpoint_test.txt";
    private static String store = "/store.txt";

    public static String endpoint_test(Context context){
        return ReadFile(context,endpoint_test);
    }
    public static String endpoint(Context context){
        return ReadFile(context,endpoint);
    }
    public static String store(Context context){
        return ReadFile(context,store);
    }

    private static String ReadFile(Context context,String FileName){
        try {
            InputStream is = context.getAssets().open("secret"+FileName);
            // We guarantee that the available method returns the total
            // size of the asset...  of course, this does mean that a single
            // asset can't be more than 2 gigs.
            int size = is.available();
            // Read the entire asset into a local byte buffer.
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            // Convert the buffer into a string.
            String text = new String(buffer);
            // Finally stick the string into the text view.
            // Replace with whatever you need to have the text into.
            if (text.length()==0){
                return null;
            }else {
                return text;
            }
        } catch (IOException e) {
            // Should never happen!
            throw new RuntimeException(e);
        }
    }
}
