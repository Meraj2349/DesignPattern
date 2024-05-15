package ClassWork.Composite;
import java.util.ArrayList;
import java.util.List;

// Component Interface
interface FileSystemComponent {
    int getSize();
}

// Leaf
class File implements FileSystemComponent {
    private int size;

    public File(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

// Composite
class Folder implements FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}

// Usage
public class FileSystem {
    public static void main(String[] args) {
        // Creating files
        File file1 = new File(100);
        File file2 = new File(200);
        File file3 = new File(150);

        // Creating folders
        Folder folder1 = new Folder();
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder();
        folder2.addComponent(file3);

        Folder mainFolder = new Folder();
        mainFolder.addComponent(folder1);
        mainFolder.addComponent(folder2);

        // Calculate size
        int totalSize = mainFolder.getSize();
        System.out.println("Total size of main folder: " + totalSize);
    }
}
