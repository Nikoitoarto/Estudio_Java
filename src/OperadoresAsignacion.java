public class OperadoresAsignacion {

    public static void main(String[] args) {
        int i = 5;
        int j = i + 5;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        
        j += 2; // j = j + 2
        System.out.println("i = " + j);

        j += 5; // j = j + 5
        System.out.println("j = " + j);
        
        j -= 4; // j = jk - 4
        System.out.println("j = " + j);
        
        j *= 2; // j = j * 2
        System.out.println("j = " + j);

        String sqlString = "select * from usuario as c";
        sqlString += "where c.nombre='andres'";
        sqlString += "and c.activo='1'";
        System.out.println("sqlString = " + sqlString);
    }
    
}
