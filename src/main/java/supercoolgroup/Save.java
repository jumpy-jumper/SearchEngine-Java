package supercoolgroup;

import org.json.simple.*;
import java.io.*;
import java.util.*;

public class Save {
	
	public static void main(String[] passedArray, final int FILE_LIMIT) throws IOException {

        // Emptying the existing file list
        FileWriter clear = new FileWriter("fileList.txt");
        clear.write("");
        clear.close();
        
        for (int i = 0; i < FILE_LIMIT; ++i) {
        	JSONObject obj = new JSONObject();
            obj.put("fileName", passedArray[i]);
            FileWriter file = new FileWriter("FileList.txt", true);
            file.write(obj.toJSONString() + "\n");
            file.flush();
        }
	}
}