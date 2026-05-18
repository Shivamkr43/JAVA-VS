public class shortcircuiting {
    public static void main(String args[]){
        String userRole = null;
        if(userRole!=null && userRole.equals("Admin")){
            System.out.println("access granted");
    }
        else {
            System.out.println("access denied");
        }
        
    }
}