package com.practice;

import java
.util.*;
import java.sql.Timestamp;

class Data{
                int id;
                String data;
                Timestamp ts;
                public Data(int id, String data){
                                this.id=id;
                                this.data=data;
                                this.ts=new Timestamp(System.currentTimeMillis());
                                
                }
                private static class DataCache{
                                private static final Map<Integer,Data> hm=new HashMap<Integer,Data>();
                                public void addMap(Data data){
                                                hm.put(data.id,data);
                                }
                                public void travelMap(){
                                                  for(Map.Entry<Integer, Data> entry:hm.entrySet()){    
                                                        Data b=entry.getValue();  
                                                        System.out.println(b.id+" "+b.data+" "+b.ts);   
                                                    }  
                                 }
                                
                }
                public void addToMap(){
                                Data.DataCache cache= new Data.DataCache();
                                cache.addMap(this);
                }
                public void traverseMap(){
                                Data.DataCache cache= new Data.DataCache();
                                cache.travelMap();
                }
                
                
}
public class DateTest {

                public static void main(String[] args) {
                                Data data= new Data(100,"aaa");
                                Data data1= new Data(200,"bbb");
                                Data data2= new Data(300,"ccc");
                                data.addToMap();
                                data1.addToMap();
                                data2.addToMap();
                                data.traverseMap();

                }

}
