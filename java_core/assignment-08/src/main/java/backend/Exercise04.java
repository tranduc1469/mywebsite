package backend;

public class Exercise04 {
    public static <N extends Comparable<N>> N max(N a,N b){
        return a.compareTo(b) > 0 ? a : b;


    }
}
