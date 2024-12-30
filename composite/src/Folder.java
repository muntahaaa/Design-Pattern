import java.util.*;
class Folder implements FileSystem {
    private String name;
    private List<FileSystem> contents;

    public Folder(String name) {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        contents.add(fileSystem);
    }

    public void remove(FileSystem fileSystem) {
        contents.remove(fileSystem);
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching in Folder: " + name);
        for (FileSystem fileSystem : contents) {
            fileSystem.search(keyword);
        }
    }
}