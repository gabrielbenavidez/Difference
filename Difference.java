/* 
@author Gabriel Benavidez
Purpose/Description: To add the difference of two array lists to an array named difference */
    
    
    public static <AnyType extends Comparable<? super AnyType>>
    void difference(List<AnyType> L1, List<AnyType> L2)
    {
        
        if(L1.size()<0 && L2.size() <0)
        {
            System.out.println("Nothing to compare");
        }
      
        ListIterator<AnyType> iterL1 = L1.listIterator();
        ListIterator<AnyType> iterL2 = L2.listIterator();
       
        
         
         AnyType itemL1 = iterL1.next();
         AnyType itemL2 = iterL2.next();
        
        try
          {
           
            int i = 0;
            boolean done = false;
                while(!done)
                {
                  
                    System.out.println("item l1 = " + itemL1);
                    System.out.println("item l2 = " + itemL2 + "\n");
                
                    if(itemL1.compareTo(itemL2) == 0)
                    {
                        if(!iterL1.hasNext() && !iterL2.hasNext())
                        {
                            done = true;
                        }
                   
                        else if(iterL1.hasNext() && iterL2.hasNext())
                        {
                            itemL1 = iterL1.next();
                            itemL2 = iterL2.next();
                        }
                 
                        else if(iterL1.hasNext() && !iterL2.hasNext())
                        {
                            itemL1 = iterL1.next();
                        }
                        else if(!iterL1.hasNext() && iterL2.hasNext())
                        {
                            itemL2 = iterL2.next();
                    
                        }
                   
                    }
                
              
                    else if(itemL1.compareTo(itemL2) < 0)
                    {
                        if(!iterL1.hasNext() && !iterL2.hasNext())
                        {
                            difference.add((Integer)itemL1);
                            done = true;
                        }
                        else
                        {
                            difference.add((Integer)itemL1);
                            itemL1 = iterL1.next();
                        }
                 
                    }
              
                    else if (itemL1.compareTo(itemL2) > 0 )
                    {
                        if(!iterL1.hasNext() && !iterL2.hasNext())
                        {
                            difference.add((Integer)itemL1);
                            done = true;
                        }
                    
                    else
                          itemL2 = iterL2.next();
                   
              
                    }
              
                }
            
          }
          
          catch ( NullPointerException e)
          {
              System.out.println(e.getMessage());
          }
          
       
    }
  
  
  
 
  
 
 
 
 
 