package src;

public class OpNull {

    public static void main(String args[]){
        promptUser();
    }

    private static void promptUser(){
    String name = "pablo";
    if(name == null || name.trim().isEmpty()){
        System.out.println("No entro su nombre");

    }else {
        System.out.println("Entro su nombre: " + name);
    }
    }
}