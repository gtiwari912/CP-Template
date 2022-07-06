public class Main {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(4);
        int[][] edges = {{0,1},{0,3}, {1,2}};
        boolean ans = uf.isCycle(edges);
        System.out.println(ans);
    }
}
