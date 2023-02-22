import model.Tree;
import model.TreeType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Tree> trees = new ArrayList<>();

        for (int i = 0; i < 500_000; i++){
            trees.add(TreeFactory.createTree(TreeType.Type.FRUTAL));
        }

        for (int i = 0; i < 500_000; i++){
            trees.add(TreeFactory.createTree(TreeType.Type.ORNAMENTAL));
        }

        System.out.println("Cantidad de arboles: " + trees.size());

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }



}