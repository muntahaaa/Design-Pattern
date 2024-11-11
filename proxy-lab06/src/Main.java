import java.util.*;
public class Main {
    public static void main(String[] args) {
        ImageViewer imageViewer = new ImageViewer();


        imageViewer.addImage("photo1.jpg");
        imageViewer.addImage("photo2.jpg");
        imageViewer.addImage("photo3.jpg");


        imageViewer.listImages();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the image to view: ");
        int choice = scanner.nextInt();

        imageViewer.displayImage(choice);

        scanner.close();
    }
}
