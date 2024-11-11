import java.util.*
;public class ImageViewer {
    private List<Image> images = new ArrayList<>();

    public void addImage(String fileName) {
        images.add(new ImageProxy(fileName));
    }

    public void listImages() {
        System.out.println("Images:");
        for (int i = 0; i < images.size(); i++) {
            System.out.println((i + 1) + ". " + images.get(i).getFileName());
        }
    }

    public void displayImage(int index) {
        if (index < 1 || index > images.size()) {
            System.out.println("Invalid image index");
            return;
        }
        System.out.println("Loading image " + index + ":");
        images.get(index - 1).display();
    }
}
