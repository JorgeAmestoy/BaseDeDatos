**CREACIÓN DE INSTANCIA ÚNICA DE CLASE** 
- Creamos la clase Main junto con otra, en este caso: BaseDeDatos
- Creamos atributos y constructores, los cuales serán privados
- Al ser private, la clase Main no puede acceder a estos, por lo que hacemos un método que devuelva un único objeto (getEjemplo)
- A través de una condicional, comprobamos si "objeto" es null, y si lo es, quiere decir que hay que instanciarlo
- En la Main, instancio dos objetos diferentes para verificar que son el mismo
