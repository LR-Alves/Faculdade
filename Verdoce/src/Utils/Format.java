
package Utils;


public class Format {

    /**
     * Formata o numero de CPF
     *
     * @return String
     * 
     */
    public static String formatCpf(String cpf) {
            if(!cpf.isEmpty() || !cpf.equals(null)){
                String CPFF = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
                return CPFF;
            }else return cpf;
        }

    }
