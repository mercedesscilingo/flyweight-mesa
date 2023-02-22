import model.Tree;
import model.TreeType;

import java.util.HashMap;

public class TreeFactory {

    private static final HashMap<TreeType.Type, TreeType> treeTypeByType = new HashMap<>();

    public static Tree createTree(TreeType.Type type) {
        TreeType treeType = treeTypeByType.get(type);

        if (treeType == null) {
            switch (type.name()) {
                case "ORNAMENTAL":
                    treeType = new TreeType(TreeType.Type.ORNAMENTAL, 200, 400, "VERDE");
                    break;
                case "FRUTAL":
                    treeType = new TreeType(TreeType.Type.FRUTAL, 500, 300, "ROJO");
                    break;
                case "FLORAL":
                    treeType = new TreeType(TreeType.Type.FLORAL, 100, 200, "CELESTE");
                    break;
            }
            treeTypeByType.put(type, treeType);
            System.out.println("Creating type tree: " + type);
        }

        return new Tree(treeType);
    }
}
