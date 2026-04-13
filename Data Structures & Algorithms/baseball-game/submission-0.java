class Solution 
{
    public int calPoints(String[] operations) 
    {
        Stack<Integer> record = new Stack<Integer>();
        for(int i = 0; i < operations.length; i++)
        {
            try{
                record.push(Integer.parseInt(operations[i]));
            }catch(NumberFormatException e){}
            if(operations[i].equals("+")){
                record.push(record.get(record.size()-1) + record.get(record.size()-2));
            }
             else if(operations[i].equals("D")){
                record.push(record.get(record.size()-1) *2);
            }
            else if(operations[i].equals("C")){
                record.pop();
            }
        }
        
        int total = 0;
        for(int totalRecord : record)
        {
            total += totalRecord;
        }
        return total;
     
    }
}