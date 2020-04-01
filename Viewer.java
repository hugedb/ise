public class GridViewer
{
    public static void view(int[][] grid)
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                switch(grid[i][j])
                {
                    case Maze.EMPTY:
                        System.out.print("aaa");
                        break;
                        
                    case Maze.WALL:
                        System.out.print("bbbb");
                        break;
                        
                    case Maze.START:
                        System.out.print("cccc");
                        break;
                        
                    case Maze.END:
                        System.out.print("ddd");
                        break;
                        
                    case Maze.VISITED:
                        System.out.print("eee");
                        break;
                        
                    default:
                        throw new AssertionError();
                }
            }
            System.out.println();
        }
 

    }
}
