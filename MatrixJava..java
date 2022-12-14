public class Matrix {
    
    int [][] matrix ; 
    int size;
    
    public Matrix(int size){
        
        matrix = new int[size][size];
        this.size = size; 
        
         for(int i=0; i< matrix.length; i++){
            
            for(int j=0; j< matrix.length; j++ ){
                
                matrix[i][j] = 0 ; 
            }
            
        }
        
        
        
    }
    
    
    private void swap(int x1, int y1, int x2, int y2){
        
        int temp = matrix[x1][y1];
        
        matrix[x1][y1] = matrix[x2][y2] ;
        matrix[x2][y2] = temp;
        
    }
    
    
    public void printMatrix(){
        
        
        
        for(int i=0; i< matrix.length; i++){
            
            for(int j=0; j< matrix.length; j++ ){
                
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    
    public void populateMatrix(){
        
        System.out.println("\nPopulating matrix...matrix populated ");
        
        int start=1;
        for(int i=0; i< matrix.length; i++){
            
            for(int j=0; j< matrix.length; j++ ){
                
                matrix[i][j] = start;
                start++;
            }
            
        }
        
        
    }
    
    
    public void flipMatrix(){
        
        
        System.out.println("\nFlipping matrix...matrix flipped: ");
        System.out.println("\nPrinting flipped matrix: ");
        
        int x2 = size - 1;
        int y2 = size - 1;
        int check = 0;
        
        for(int i =0 ; i <size/2 ; i++){
            for(int j = 0 ; j < size ; j++){
                
                
                if(y2 != check ){
                     swap(i,j,x2,y2);
                }
               
                
              
                
                y2--;
                
            }
          
            check++;
            y2 = size - 1; 
            x2--;
        }
    }
    
    
    
    

}