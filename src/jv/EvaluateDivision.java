package jv;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations,
                                 double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] answer = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            answer[i] = dfs(queries.get(i).getFirst(), queries.get(i).getLast(), graph, new HashSet<>());
        }
        return answer;
    }

    private double dfs(String first, String second, Map<String, Map<String, Double>> graph, Set<String> visited) {
        if (!graph.containsKey(first)) {
            return -1.0;
        }
        if (first.equals(second)) {
            return 1.0;
        }

        visited.add(first);

        for (String neighbor : graph.get(first).keySet()) {
            if (!visited.contains(neighbor)) {
                double result = dfs(neighbor, second, graph, visited);
                if (result != -1.0) {
                    return result * graph.get(first).get(neighbor);
                }
            }
        }
        return -1.0;
    }

    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String u = equation.get(0);
            String v = equation.get(1);
            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(u).put(v, values[i]);
            graph.get(v).put(u, 1.0 / values[i]);
        }
        return graph;
    }
}
