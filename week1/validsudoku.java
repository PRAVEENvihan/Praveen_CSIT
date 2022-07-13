class Solution {
    public boolean isValidSudoku(char[][] board) {
        char a[]={"1","2","3","4","5","6","7","8","9"},temp;
        int c;
        for(int i=0;i<9;i++)
        {
            for(int j=0; j<9;j++)
            {
                temp=char[i][j];
                for(int k=0; k<9;k++)
                {
                    if(temp==a[k])
                        c=k;
                    
                }
            }
        }
        
    }
}
