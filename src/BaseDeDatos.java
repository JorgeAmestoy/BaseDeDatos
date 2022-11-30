public class BaseDeDatos {

    private String usuario;
    private String token;

    private static BaseDeDatos ejemplo = null;


    private BaseDeDatos(){

    }

    public static BaseDeDatos getEjemplo(){

        if (ejemplo == null){

            ejemplo = new BaseDeDatos();
        }
 //si no es nulo, no hago el new, solo lo retorno
        return ejemplo;


    }

    public static BaseDeDatos getEjemplo2(){

        if (ejemplo==null){

        }
        return ejemplo;

    }




    public void setUsuario(String usuario){
        this.usuario = usuario;

    }

    public String getUsuario(){
        return usuario;
    }

    public void setToken(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }

}





