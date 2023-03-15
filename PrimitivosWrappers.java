/**
 * exercicio ebac mod 9
 */
 //criado por @fabio.buani

public class PrimitivosWrappers {
    public static void main(String args[]) {

        int num = 123456789;
        System.out.println(num);

        Integer numI = num;

        System.out.println(num);

        long cpf = 987654321;
        System.out.println(cpf);
        //conversão de primitivo long para wrapper Integer
        Integer cpfI = Math.toIntExact(cpf);
        System.out.println(cpf);






    }








}
