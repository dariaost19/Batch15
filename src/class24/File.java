package class24;

public abstract class File {
    int size;
    File(int size){

    }
    //Create a class File that will have the following behaviors: open, edit, close.
    // Edit and close are implemented method while open is an abstract. Create 3 subclasses:
    // JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour: Example: to open .
    // java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
   abstract void Open();
    void Edit(){
        System.out.println("You can Edit file ");
    }
    void Close(){
        System.out.println("You can close the file by clicking on X button");
    }
}
class JavaFile extends File{
    JavaFile(int size) {
        super(size);
    }

    @Override
    void Open() {
        System.out.println("You can open the Java File using Intellij ");
    }

}
class WordFile extends File{
    WordFile(int size) {
        super(size);
    }

    @Override
    void Open() {
        System.out.println("You can open Word File using Microsoft Word");
    }


}
class PDFFile extends File{
    PDFFile(int size) {
        super(size);
    }

    @Override
    void Open() {
        System.out.println("You can open PDF file using Adobe Acrobat ");
    }


}
