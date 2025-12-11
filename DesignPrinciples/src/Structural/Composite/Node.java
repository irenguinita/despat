//package Composite;
//
//// to treat different objects like they are the same
//
//import java.util.ArrayList;
//import java.util.List;
//
//public interface Node {
//    long getSize();
//}
//
//public class File implements Node {
//    private long size;
//    public Long getSize() {
//        return size;
//    }
//}
//
//public class Folder implements Node {
//    private List<Node> children = new ArrayList<>();
//    private long size;
//
//    public long getSize() {
//        long totalSize = this.size;
//        for(Node child : children) {
//            totalSize += child.getSize();
//        }
//        return totalSize;
//    }
//}