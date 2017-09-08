public class MySingleTon {
     
    private static MySingleTon myObj;
    
    private MySingleTon(){}
    
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }
     
    public void getSomeThing(){
       
        System.out.println("Singletone class example");
    }
     
    public static void main(String a[]){
        MySingleTon st = MySingleTon.getInstance();
        st.getSomeThing();
    }
}