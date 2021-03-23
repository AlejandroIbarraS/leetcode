class Solution {
    public int numIslands(char[][] grid) {
        int cont=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    cont++;
                    limpiar(grid,j,i,cont,grid.length,grid[0].length);
                }
            }
        }
        cont=cont-1;
        return cont;
    }
    
    public static void limpiar(char[][] grid, int x, int y, int cont, int fil, int col){
        for(int i=y-1;i<=y+1;i++)
            if(i!=-1 && i<fil)
                if(grid[i][x]=='1'){
                    grid[i][x]=(char)(cont+'0');
                    limpiar(grid,x,i,cont,fil,col);
                }  

        for(int i=x-1;i<=x+1;i++)
            if(i!=-1 && i<col)
                if(grid[y][i]=='1'){
                    grid[y][i]=(char)(cont+'0');
                    limpiar(grid,i,y,cont,fil,col);
                } 
    }
}