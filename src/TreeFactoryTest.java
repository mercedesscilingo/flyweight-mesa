import model.Tree;
import model.TreeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TreeFactoryTest {

    @Test
    @DisplayName(value = "Should successfully create an ornamental tree")
    void createOrnamentalTree() {
        Tree tree = TreeFactory.createTree(TreeType.Type.ORNAMENTAL);
        Assertions.assertEquals(200, tree.getHeight());
        Assertions.assertEquals("VERDE", tree.getColor());
        Assertions.assertEquals(400, tree.getWidth());
        Assertions.assertEquals(TreeType.Type.ORNAMENTAL, tree.getName().getValue());
    }

    @Test
    @DisplayName(value = "Should successfully create a frutal tree")
    void createFrutalTree() {
        Tree tree = TreeFactory.createTree(TreeType.Type.FRUTAL);
        Assertions.assertEquals(500, tree.getHeight());
        Assertions.assertEquals("ROJO", tree.getColor());
        Assertions.assertEquals(300, tree.getWidth());
        Assertions.assertEquals(TreeType.Type.FRUTAL, tree.getName().getValue());
    }

    @Test
    @DisplayName(value = "Should successfully create a floral tree")
    void createFloralTree() {
        Tree tree = TreeFactory.createTree(TreeType.Type.FLORAL);
        Assertions.assertEquals(100, tree.getHeight());
        Assertions.assertEquals("CELESTE", tree.getColor());
        Assertions.assertEquals(200, tree.getWidth());
        Assertions.assertEquals(TreeType.Type.FLORAL, tree.getName().getValue());
    }
}