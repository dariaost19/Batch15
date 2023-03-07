package class24;

public class FileTester {
    public static void main(String[] args) {
        File []files={new JavaFile(102),new WordFile(1024),new PDFFile(20)};
        for(File f:files){
            f.Open();
            f.Edit();
            f.Close();
        }

        for (int i = 0; i <files.length ; i++) { // second way to access using regular loop

            File f1=files[i]; //accessing element inside array
            f1.Open();
            f1.Edit();
            f1.Close();
            
        }
    }
}
