package CursoJava.Ycolecoes.Test;

import CursoJava.Ycolecoes.Domain.SmartPhone;

public class equalsTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1", "Iphone");
        SmartPhone s2 = new SmartPhone("1ABC1", "Iphone");
        
        System.out.println(s1.equals(s2));
    


          // SmartPhone s2 = s1; //agora estao fazendo referencia para o msm objeto

    }
}
