public class Main {
    public static void main(String[] args) {

        File file1 = new File("File1.txt", "This is a sample file containing Java programming concepts.");
        File file2 = new File("File2.txt", "Another file containing Python programming concepts.");
        File file3 = new File("File3.txt", "This file discusses design patterns in Java.");


        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");


        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        folder2.add(folder1);



        folder2.search("Java");

        folder2.remove(folder1);
        //folder2.search("Java");
    }
}