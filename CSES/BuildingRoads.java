import java.util.*;

public class BuildingRoads {

    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void dfs(int u) {
        visited[u] = true;
        for (int v : adj[u]) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        visited = new boolean[n + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                list.add(i);
            }
        }
        System.out.println(list.size() - 1);
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println(list.get(i) + " " + list.get(i + 1));
        }
        sc.close();
    }
}