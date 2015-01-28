/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

/**
 *
 * @author user
 */
public class Appointment {
    private String date;
    private String starts ;
    private String ends ;
    private String venue;
    private String purpose;
    private String invitees;
    private String executive;
    private String app_id;
    private int duration;
    public Appointment(String date,String starts ,String ends,String venue,String purpose,String invitees,String executive,String id )
    {
       this.date=date;
       this.starts=starts;
       this.ends=ends;
       this.purpose=purpose;
       this.venue=venue;
       this.invitees=invitees;
       this.executive=executive;
       this.app_id=id;
        duration=Integer.parseInt(ends)-Integer.parseInt(starts); 
    }
public String getappdate()
{      
 return date;   
}
public String getappstart()
{      
 return starts;   
}
public String getappend()
{      
 return ends;   
}
public String getapppurpose()
{      
 return purpose;   
}
public String getappvenue()
{      
 return venue;   
}
public String getappexec()
{      
 return executive;   
}
public String getappid()
{
    return app_id;
}        
public int getduration()
{
  return duration;  
}      
}
