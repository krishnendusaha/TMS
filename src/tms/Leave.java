/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

/**
 *
 * @author user
 */
public class Leave {
    private String date;
    private String starts;
    private String ends ;
    private String reason;
     private String executive;
     private String lv_id;
     private int duration;
    public Leave(String date, String starts,String ends ,String reason,String executive,String id)
    {
      this.date=date;
      this.starts=starts;
      this.ends=ends;
      this.reason=reason;
      this.executive=executive;
      this.lv_id=id;
      duration=Integer.parseInt(ends)-Integer.parseInt(starts); 
    }
    public String getlvdate()
    {
        return date;
    }   
     public String getlvstart()
    {
        return starts;
    } 
      public String getlvend()
    {
        return ends;
    } 
       public String getlvreason()
    {
        return reason;
    }  
     public String getlvexec()
    {
        return executive;
    }  
    public String  getappid()
    {
      return lv_id;  
    }
    
   public int getduration()
{
  return duration;  
}    
}
