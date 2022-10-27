package AlgorithmsOptimized;

// Given a word grid and a word, find if the word exists in the grid.
public class WordInGrid {

    public static void main(String[] args) {
        char grid[][]  = {
            {'a', 'b', 'e', 'd'}, 
            {'d, 'c', 'v', 'd'}, 
            {'b, 'x', 'c', 'd'}, 
            {'b, 'e', 'm', 'n'}, 
        };
        System.out.println(findWord(grid, "abced"));
        System.out.println(findWord(grid, "abcd"));
    }

    private static boolean findWord(char[][] grid, String string) {
        if(grid == null || grid.length == 0)
            return false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(search(grid, string, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    public static boolean search(char[][] grid, String string, int row, int col, int ind) {
        if(string.length() == ind)
            return true;
        if(row < 0 || row == grid.length || col < 0 || col == grid[0].length)
            return false;
        if(string.charAt(ind) != grid[row][col])
            return false;
        return (search(grid, string, row + 1, col, ind + 1)
            || search(grid, string, row - 1, col, ind + 1)
            || search(grid, string, row, col + 1, ind + 1)
            || search(grid, string, row, col - 1, ind + 1));
    }
    
}
