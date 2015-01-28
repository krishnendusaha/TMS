/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

/**
 *
 * @author user
 */
public class Meeting {
 private  String date;
 private  String starts;
 private  String ends;
 private  String venue;
 private  String purpose;
 private  String executives;
 private String[] exec=new String[10];
 private String meeting_id;
 
 private int duration;
 public Meeting( String date, String start, String end,String purpose,String venue,String execs,String meet_id)
    {
        this.date = date;
        this.starts = start;
        this.ends = end;
        this.venue=venue;
        this.purpose = purpose;
        this.executives=execs;
        this.meeting_id=meet_id;
        exec=exec_string_to_array(execs);
        duration=Integer.parseInt(end)-Integer.parseInt(start); 
    } 
 
 public String[] get_exec_array()
 {
    return exec; 
 }       
   
     
   private String[] exec_string_to_array(String s )
  {
      int i;
      String[] execs=new String[10] ;
      int count=0;
      String sub="";
     for(i=0;i<s.length();i++)
     {
         if(s.charAt(i)=='/')
         {
             
             execs[count++]=sub;
             sub="";
         }
        else {
             sub=sub+s.charAt(i);
         }
     }
     if(!"".equals(sub))
     { execs[count++]=sub;}
      
      return execs;
  
  }

  public String getmeetexec()
 {
   return executives;  
 }
 public String getmeetdate()
 {
   return date;  
 }
 public String getmeetstart()
 {
   return starts;  
 }
 public String getmeetend()
 {
   return ends;  
 }
 public String getmeetvenue()
 {
   return venue;  
 }
 public String getmeetpurpose()
 {
   return purpose;  
 }
  public String getmeetid()
  {
    return meeting_id;  
  }  
  public int getduration()
  {
     return duration; 
  }       
}
