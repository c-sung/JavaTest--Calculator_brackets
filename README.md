# JavaTest--Calculator_brackets
Calculator.java, which is able to calculate "()".

括號內只支援一次運算，由於構想大意了，尚未修復。     
原因：做完括號內第一次運算後，remove ArrayList裡的 "(" , ")"   ，造成第二次算是判別失誤。     
EX:(1+5)*3  ==> 

```
(1+5)*3                  //Input    
1:[(, +, ), *]           //ArrayList cacu   
1:[, 1, 5, , 3]          //ArrayList cal    
2:[(, +, ), *]           //ArrayList shown 2, cacu    
2:[1, 5, 3]              //ArrayList shown 2, cal, removed empty String   
seikou1                  //Complete1    
seikou                   //Last check   
[18.0]                   //Answer(Float)    
```

```
(1+2+3)*5     
1:[(, +, +, ), *]       
1:[, 1, 2, 3, , 5]      
2:[(, +, +, ), *]     
2:[1, 2, 3, 5]        
seikou1     
seikou1       
seikou      
[30.0]                     //Correct Answer         
```
```
5*(1+2+3)       
1:[*, (, +, +, )]       
1:[5, , 1, 2, 3, ]      
2:[*, (, +, +, )]     
2:[5, 1, 2, 3]        
seikou1     
seikou      
seikou      
[18.0]                       //incorrect answer      
```
