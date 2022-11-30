public class Main {


    public static void main(String[] args) {

        BaseDeDatos obx1 = BaseDeDatos.getEjemplo();

        obx1.setUsuario("Jorge");
        obx1.setToken("1234");



        BaseDeDatos obx2 = BaseDeDatos.getEjemplo2();

        obx2.setUsuario("Miguel");
        obx2.setToken("6789");




    }
}
